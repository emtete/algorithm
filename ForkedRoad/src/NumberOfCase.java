/**
 * Created by victor on 2016. 5. 30..
 */
public class NumberOfCase {

    int[][] log = null;
    int r = 0;
    int h = 0;
    int count = 0;

    public NumberOfCase(){

    }

    public NumberOfCase(int r, int h){
        log = new int[r+1][h+1];
        this.r = r;
        this.h = h;
    }

    public int dfs(int r, int h){
        count ++;
        if(log[r][h] != 0) return log[r][h];
        if(r >= this.r) return 1;
        if(h >= this.h) return 1;
        System.out.println(count);
        return log[r][h] = dfs(r+1, h) + dfs(r, h+1);
    }
}
