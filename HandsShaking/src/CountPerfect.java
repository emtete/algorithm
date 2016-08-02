/**
 * Created by victor on 2016. 6. 5..
 */
public class CountPerfect {
    boolean[] p = null;
    long dp[] = null;

    public long countPerfect(int n){
        p = new boolean[n];
        dp = new long[n+1];

        return dfs(0, n-1);
    }

    public long dfs(int start, int end){
        int n = end - start + 1;
        if(end - start == 1){
            return 1;
        }

        if( dp[ n ] != 0 ) return dp[ n ];
        for(int i=start; i <= end; i++){
            if(i % 2 == 1){

                if( i - start == 1 ){
                    dp[n] += dfs( i+1, end );
                }else if( i == end ){
                    dp[n] += dfs( start+1, end-1 );
                }else{
                        dp[n] += dfs( i + 1, end ) * dfs( start+1, i-1 );
                }
            }
        }
        return dp[n];
    }
}
