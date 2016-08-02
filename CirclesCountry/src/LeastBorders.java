/**
 * Created by victor on 2016. 6. 10..
 */
public class LeastBorders {
    public int leastBorders(int[] X, int[] Y, int[] R, int x1, int y1 , int x2, int y2){
        int boundary = 0;
        for(int i=0; i < X.length; i++){
            int X1 = ( X[i] >= x1 ) ? X[i] - x1 : x1 - X[i];
            int Y1 = ( Y[i] >= y1 ) ? Y[i] - y1 : y1 - Y[i];

            if( Math.sqrt( Math.pow(X1, 2) + Math.pow(Y1, 2) ) < R[i] ) boundary++;

            int X2 = ( X[i] >= x2 ) ? X[i] - x2 : x2 - X[i];
            int Y2 = ( Y[i] >= y2 ) ? Y[i] - y2 : y2 - Y[i];

            if( Math.sqrt( Math.pow(X2, 2) + Math.pow(Y2, 2) ) < R[i] ) boundary++;

        }
        return boundary;
    }

}
