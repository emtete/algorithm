import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Created by victor on 2016. 7. 10..
 */
//// TODO: 2016. 7. 10. 멥 초기화
//// TODO: 2016. 7. 10. 맵 이름 기간 저장하기
//// TODO: 2016. 7. 10. 인트 배열 생성하기
//// TODO: 2016. 7. 10. 가장 작은 값 찾기
//// TODO: 2016. 7. 10. 가장 작은 값에 해당하는 이름의 index 저장하기
//// TODO: 2016. 7. 10.

public class BatchSystemByBook {
    public int[] schedule(int[] duration, String[] user){

        int n = user.length;
        int[] index = new int[n];
        Map map = new HashMap<String, Long>();

        for(int i=0; i < n; i++) {
            if(map.containsKey(user[i]))
                map.put( user[i], (long)map.get(user[i])+duration[i] );
            else
                map.put( user[i], duration[i]+0L );
        }



//        map.entrySet().stream()
//                .sorted(Map.Entry.comparingByValue())
//                .forEach(entry -> ... );


        int N = 0;
        boolean[] isSaved = new boolean[n];
        while( N < n ){
            String target = "";
            long min = -1;
            for(int i=0; i < n ; i++){
                if( isSaved[i] ) continue;
                if( min > (long)map.get(user[i]) || min == -1){
                    min = (long)map.get(user[i]);
                    target = user[i];
                }
            }
            for(int i=0; i < n; i++){
                if( isSaved[i] ) continue;
                if( target.equals(user[i]) ){
                    index[N++] = i;
                    isSaved[i] = true;
                }
            }
        }
        return index;
    }




}

