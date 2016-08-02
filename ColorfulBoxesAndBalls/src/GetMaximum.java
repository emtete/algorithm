import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by victor on 2016. 6. 5..
 */
public class GetMaximum {
    public int getMaximum(int numRed, int numBlue, int onlyRed, int onlyBlue, int bothColorsl){

        int score = 0;

        if( onlyBlue + onlyRed >= bothColorsl * 2){
            score += onlyBlue * numBlue;
            score += onlyRed * numRed;
        }else{

            if( numBlue == numRed ){
                score = numBlue * 2 * bothColorsl;
            }else if( numBlue > numRed ){
                score = numRed * 2 * bothColorsl;
                score += (numBlue - numRed) * onlyBlue;
            }else{
                score = numBlue * 2 * bothColorsl;
                score += (numRed - numBlue) * onlyRed;
            }
        }

        return score;
    }
}
