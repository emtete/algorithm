import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by victor on 2016. 6. 24..
 */
public class MinimalMoves  {
    int[][] dp;
    Queue<Integer> queue = new LinkedList<Integer>();
    int all = 0;

    public int minimalMoves(int A, int B, int K) {
        if (A + B < K) return -1;
        if (A == 0 ) return 0;
        int count = 0;

        if (K * 2 < (A + B)) {

            count = A / K-1 ;
            A = (A % K == 0) ? 2*K : A % K + K;
            B = K * 2 - A;
            initiate(A, B, count);
            return wfs(A, K * 2 - A, K, all);
        } else {

            initiate(A, B, count);
            return wfs(A, B, K, all);
        }
    }


    public void initiate(int A, int B, int count ){

        dp = new int[A + B + 1][A + B + 1];
        all = A + B;

        for(int i=0; i < dp.length; i++){
            for(int j=0; j < dp[0].length; j++){
                dp[i][j] = -1;
            }
        }

        dp[A][B] = count;
    }


    public int wfs(int A, int B, int K, int all) { // all 은 전체, A+B

        queue.add(A);

        while (queue.peek() != null) {
            A = queue.poll();
            B = all - A;

            if (A == 0) return dp[A][B];

            for (int i = 0; i <= K; i++){

                int flipA = (A > B)? K - i : i,
                    flipB = (A > B)? i : K - i,
                    nextA = A - flipA + flipB,
                    nextB = B - flipB + flipA;

                if (flipA > A || flipB > B) continue;
                if (dp[nextA][nextB] != -1) continue;

                if( A > B && ( nextB >= 0 && nextA <= all ) ){
                    save(nextA, nextB, A, B);
                    if( nextA == K || nextA == 0) break;

                }else if( A <= B && ( nextA >= 0 && nextB <= all ) ){
                    save(nextA, nextB, A, B);
                    if( nextA == K || nextA == 0) break;
                }
            }
        }//while

        return -1;
    }

    public void save(int nextA, int nextB, int A, int B){
        queue.offer(nextA);
        dp[nextA][nextB] = dp[A][B] + 1;
    }




}