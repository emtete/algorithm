/**
 * Created by victor on 2016. 7. 6..
 */
public class TotalSalary1 {

    long [] dp;
    String N = "";

    public long totalSalary(String[] relations){
        dp = new long[ relations[0].length() ];
        long totalSalary = 0L;
        createN(relations);

        for(int i=0; i < relations.length; i++){
            if(dp[i] != 0) continue;
            dfs(relations, i);
        }
        for(int i=0; i < relations.length; i++) totalSalary += dp[i];

        return totalSalary;
    }

    public void createN(String [] relations){
        for(int i=0; i < relations.length; i++) N += "N";
    }

    public long dfs(String[] relations, int index){
        if( relations[index].equals(N)) return dp[index] = 1;

        if( dp[index] != 0 ) return dp[index];

        for(int i=0; i < relations[0].length(); i++){
            if(relations[index].charAt(i) == 'Y') dp[index] += dfs(relations, i);
        }

        return dp[index];
    }
}
