import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by victor on 2016. 6. 5..
 */
public class Schedu1e {
    public int[] schedu1e(int[] duration, String[] user){
        long[] durations = initiation(duration);
        int[] result = new int[duration.length];

        for(int i=0; i < result.length; i++){ // 초기화
            result[i] = i;
        }
        searchSamePeople(durations, user);

        for(int a: duration){
//            System.out.print(a+" ");
        }

        sorting(duration, result);

        return result;
    }

    public long[] initiation(int[] duration){
        long[] durations = new long[duration.length];
        for(int i=0; i < duration.length; i++){
            durations[i] = duration[i];
        }
        return durations;
    }

    public void sorting(int[] duration, int[] result){
        for(int i=duration.length-1; i > 0 ; i--){
            for(int j=0; j < i; j++){
                if( duration[j] > duration[j+1] ){
                    int temp = duration[j];
                    duration[j] = duration[j+1];
                    duration[j+1] = temp;

                    temp = result[j];
                    result[j] = result[j+1];
                    result[j+1] = temp;
                }
            }
        }
    }

    public void searchSamePeople(long[] duration, String[] user){
        for(int i=0; i < duration.length-1; i++){
            HashSet sameIndex = new HashSet();
            for(int j=i+1; j < duration.length; j++){
//                int[] sameIndex = new int[duration.length];
                if( user[i].equals(user[j]) ){
                    sameIndex.add(i);
                    sameIndex.add(j);
//                    System.out.println(i +" "+ j +" "+user[i]+" "+user[j]);
                }
            }
            long sum = 0;
            Iterator<Integer> iterator = sameIndex.iterator();
            while(iterator.hasNext()){
                sum += duration[ iterator.next() ];
            }
            iterator = sameIndex.iterator();
            while(iterator.hasNext()){
                duration[ iterator.next() ] = sum;
            }
        }
    }
}
