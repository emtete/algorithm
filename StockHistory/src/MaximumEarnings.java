/**
 * Created by victor on 2016. 6. 5..
 */
public class MaximumEarnings {
    public int maximumEarnings(int initiallnvestment, int monthlyContribution, String[] stockPrices){
        long[][] prices = changeValue(stockPrices);
        double[][] dp = new double[stockPrices.length][stockPrices[0].length()];
        double profit = 0;
        double maxPer = 0D;

        for(int i=stockPrices.length-1; i >= 0; i--){

            if( i == stockPrices.length-1 ) continue;

            for(int j=0; j < prices[0].length; j++){
                dp[i][j] = (double)(prices[stockPrices.length-1][j]) / (double)prices[i][j];
                maxPer = Math.max(maxPer, dp[i][j]);
            }
            if(maxPer > 1 && i != 0 && monthlyContribution != 0){
                profit += (double)monthlyContribution * (maxPer - 1);
            }else if( maxPer > 1 &&  i == 0 && initiallnvestment != 0){
                profit += (double)initiallnvestment * (maxPer - 1);
            }
        }
        return (int)Math.round(profit);
    }



    public long[][] changeValue(String[] stockPrices){

        String[] price = stockPrices[0].split(" ");
        long[][] prices = new long[stockPrices.length][price.length];

        for(int i=0; i < stockPrices.length; i++){
            price = stockPrices[i].split(" ");
            for(int j=0; j < price.length; j++){
                prices[i][j]=Long.parseLong( price[j] );
            }
        }

        return prices;

    }
}
