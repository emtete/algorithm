import java.util.Arrays;

/**
 * Created by victor on 2016. 5. 28..
 */
public class SumUpMaxValueByRecursion {
    int[] weight=null;
    int[] value=null;
    int[][] dp = new int[6][11];


    int count = 0;

    public SumUpMaxValueByRecursion(){

    }

    public SumUpMaxValueByRecursion(int[] weight, int[] value){
        this.weight = weight;
        this.value = value;
    }

    public int sumUpMaxValueByRecursion(){
        return dfs(0,0);
    }

    public int dfs(int sumUpWeight, int i){
        count++;
        System.out.println(count);
        if(sumUpWeight > 10) return -(value[i-1]);
        if(i >= 5) return 0;
        if(dp[i][sumUpWeight] != 0) return dp[i][sumUpWeight];

        return dp[i][sumUpWeight] = Math.max( dfs(sumUpWeight, i+1) , dfs(sumUpWeight + weight[i],  i+1) + value[i]);
    }

}
