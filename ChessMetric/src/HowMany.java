/**
 * Created by victor on 2016. 6. 3..
 */
public class HowMany {
    long[][][] dp = null;
    int[] start = null;
    int[] end = null;
    int[] movesX = new int[]{1,1,1,0,0,-1,-1,-1, 1, 1, 2, 2, -1, -1, -2, -2};
    int[] movesY = new int[]{1,0,-1,1,-1,1,0,-1, 2, -2, 1, -1, 2, -2, 1, -1};
    int size = 0;
    int numMoves = 0;

    public long howMany(int size, int[] start, int[] end, int numMoves){

        dp = new long[numMoves][size][size];
        this.start = start;
        this.end = end;
        this.size = size;
        this.numMoves = numMoves;

        for(int i=0; i < numMoves; i++){
            for(int j=0; j < size; j++){
                for(int k=0; k < size; k++){
                    dp[i][j][k] = -1;
                }
            }
        }

        return dfs(0, start[0], start[1]);
    }

    public long dfs(int n, int row, int col){
        if(numMoves <= n){
            if( (end[0] == row) && (end[1] == col) ){
                return 1;
            }else{
                return 0;
            }
        }

        if(dp[n][row][col] != -1) return dp[n][row][col];

        for(int i=0; i < movesX.length; i++){
            int willGoX = 0;
            int willGoY = 0;
            if( (row + movesX[i] >= 0) && (row + movesX[i] <= size-1)
                && (col + movesY[i] >= 0) && (col + movesY[i] <= size-1)
                    ){
                willGoX = row + movesX[i];
                willGoY = col + movesY[i];
                if( dp[n][row][col] == -1 ) dp[n][row][col] = 0;
                dp[n][row][col] += dfs(n+1, willGoX, willGoY);
            }
        }

        return dp[n][row][col];
    }
}