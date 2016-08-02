/**
 * Created by victor on 2016. 6. 24..
 */
public abstract class MinimalMovesProxy {
    int[][] dp;
    public int minimalMoves(int A, int B, int K){
        return 0;
    }
    public void minimalMovesTest(int A, int B, int K, int count){
        System.out.println(A+"-"+B+"-"+K+"-"+count);
    }
    public void judgementTest(int A, int B){
        System.out.println(A+"-"+B);
    }

    public void displayProcess(int A, int B, int K){
        for(int i=0; i < A; i++) System.out.print(0);
        for(int i=0; i < B; i++) System.out.print(1);
        System.out.println();
    }

    public void savedQueue(int indexA, int indexB){
        System.out.println("indexA - "+indexA+", indexB - "+indexB);
//        System.out.println();
    }
}
