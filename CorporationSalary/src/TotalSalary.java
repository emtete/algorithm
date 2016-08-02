/**
 * Created by victor on 2016. 6. 1..
 */
public class TotalSalary {
    String[] relations = null;
    String no = "";
    long[] dp = null;
    long sum = 0;

    public long totalSalary(String[] relations){
        this.relations = relations;
        dp = new long[relations.length];
        for(int i=0; i < relations.length; i++){
            no += "N";
        }

        for(int i=0; i < relations.length; i++){
            sum += dfs(i);
        }

        return sum;
    }

    public long dfs(int n){
        if( relations[n].equals(no) )return 1;
        if( dp[n] != 0 ) return dp[n];
        for(int i=0; i < relations.length; i++){
            if(relations[n].charAt(i) == 'Y'){
                dp[n] += dfs(i);
            }
        }
        return dp[n];
    }

}
