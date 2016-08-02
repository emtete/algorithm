/**
 * Created by victor on 2016. 6. 27..
 */
public class OccurrencesNumber {
    String s1 = "X-X";
    String s2 = "---";
    String s3 = "";
    String s4 = "";


    public int occurrencesNumber(String[] pattern, int time){

        double times = Math.pow(3, time);

//        createS2(times);
        createS1(times/3);

        System.out.println(s1);
        System.out.println(s4);

        return 0;
    }




    public void createS1(double time){
//        double time = times / 3;
        if(time > 1){
            createS2(time);
            for(int i=0; i < 3; i++){
                createS1(time/3);
                if( i == 0 )s3 += s1;
                if( i == 1 )s3 += s2;
                if( i == 2 )s3 += s1;
            }
            s1 = s3;
            s2 = s4;
            s3 = "";
        }
    }


    public void createS2(double time){
//        double time = times / 3;
//        if(time > 1){
            for(int i=0; i < time; i++){
                s4 += s2;
            }
//            s2 = s4;
//        }
    }
}
