import java.util.*;
import java.util.stream.Stream;

/**
 * Created by victor on 2016. 7. 11..
 */
public class BatchSystemBySortingMap {
    public int[] schedule(int[] duration, String[] user) {

        int n = user.length;
        int[] index = new int[n];
        Map<String, Long> map = new LinkedHashMap<String, Long>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(user[i]))
                map.put(user[i], (long) map.get(user[i]) + duration[i]);
            else
                map.put(user[i], duration[i] + 0L);
        }

        map = sortByValue(map);

            int j = 0;
            for (Map.Entry<String, Long> e : map.entrySet()) {
                for(int k=0; k < n; k++){
                    if (e.getKey().equals(user[k])) index[j++] = k;
                }
            }

        return index;
    }

    public <K, V extends Comparable<? super V>> Map<K, V> sortByValue( Map<K, V> map ){
        Map<K, V> result = new LinkedHashMap<>();
        Stream<Map.Entry<K, V>> st = map.entrySet().stream();

        st.sorted( Map.Entry.comparingByValue() ).forEachOrdered( e -> result.put(e.getKey(), e.getValue()) );

        return result;
    }
}
