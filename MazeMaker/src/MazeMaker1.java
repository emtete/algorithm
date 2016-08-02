import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by victor on 2016. 7. 6..
 */
public class MazeMaker1 {
    public int longestPath(String[] maze, int startRow, int startCol, int[] moveRow, int[] moveCol){
        int nig = ctr(maze);            // nig -> notIsGone
//        int lpc = 0;                    // lpc -> longestPathCount
        int [][] isGone = new int[maze[0].length()][maze.length];

        initialize(isGone);

        Queue willgoX = new LinkedList<Integer>();
        Queue willgoY = new LinkedList<Integer>();

        int nowX = -1;
        int nowY = -1;

        willgoX.offer(startCol);
        willgoY.offer(startRow);
        isGone[startCol][startRow] = 0;
//        --nig;

        while(nig > 0 && !willgoX.isEmpty() ){
            nowX = (int)willgoX.poll();
            nowY = (int)willgoY.poll();
            nig--;
//            lpc++;
            for(int i=0; i < moveRow.length; i++){
                int tempX = nowX + moveCol[i];
                int tempY = nowY + moveRow[i];

                int goX = 0;
                int goY = 0;
                if( !( ( 0 <= tempX ) && ( tempX < maze[0].length() )  &&
                     ( ( 0 <= tempY ) && ( tempY < maze.length      )     )  )  )        continue;

                goX = tempX;
                goY = tempY;

                if( isGone[goX][goY] == -1 && maze[goY].charAt(goX) != 'x'){
                    willgoX.offer( goX );
                    willgoY.offer( goY );
                    isGone[goX][goY] = isGone[nowX][nowY] + 1;
                }
            }
        }

        if( nig > 0 && willgoX.isEmpty() ) return -1;
        if( nig <= 0 && !willgoX.isEmpty() ) return -2;


        return isGone[nowX][nowY];
    }

    public void initialize(int [][] isGone){
        for(int i=0; i < isGone.length; i++){
            for(int j=0; j < isGone[0].length; j++){
                isGone[i][j] = -1;
            }
        }
    }

    public int ctr(String [] maze){      // ctr -> countTotalRoad
        int tr = 0;                        // tr -> totalRoad
        for(int i=0; i < maze.length; i++){
            for(int j=0; j < maze[0].length(); j++){
                if( maze[i].charAt(j) == '.') ++tr;
            }
        }
        return tr;
    }
}
