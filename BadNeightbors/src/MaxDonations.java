/**
 * Created by victor on 2016. 6. 1..
 */
public class MaxDonations {
    public int maxDonations(int[] donations){
        int firstCase = 0;
        int secondCase = 0;

        int[] dp = new int[donations.length];


        for(int i=0; i < donations.length-1; i++){
            if(i==0){
                dp[i] = donations[0];
            }else if(i==1){
                dp[i] = Math.max(dp[0], donations[1]);
            }else{
                dp[i] = Math.max(dp[i-1], dp[i-2]+donations[i]);
            }
        }
        firstCase = dp[donations.length-2];

        for(int i=1; i < donations.length; i++){
            if(i==1){
                dp[i] = donations[1];
            }else if(i==2){
                dp[i] = Math.max(dp[1], donations[2]);
            }else{
                dp[i] = Math.max(dp[i-1], dp[i-2]+donations[i]);
            }
        }
        secondCase = dp[donations.length-1];
        return Math.max(firstCase, secondCase);
    }
}
