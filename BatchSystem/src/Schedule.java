//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
///**
// * Created by victor on 2016. 7. 8..
// */
//public class Schedule {
//    List durations = new ArrayList<>();
//    List users = new ArrayList<>();
//
//    public int[] schedule(int[] duration, String[] user){
//        initiation(duration, user);
//
//        return null;
//    }
//
//    public List sort(List durations, List users){
//        int size = durations.size();
//
//        if(size > 3){
//            List temp1 = sort( durations.subList(0, size/2), users.subList(0, size/2) );
//            List temp2 = sort( durations.subList(size/2, size-1), users.subList(0, size/2) );
//            List temp3 = new ArrayList<>();
//            int i = 0;
//            int j = 0;
//            while( temp3.size() < size){
//                int nb1 = (int)temp1.get(i);
//                int nb2 = (int)temp2.get(j);
//                if( nb1 == nb2){
//
//                }
//            }
//
//        }
//
//
//
//
////            durations = sort(durations);
//
//        List list1 = durations.subList(0);
//
//
//    }
//
//    public void sort1(int index, int count){
//        int index1 = index;
//        int count1 = count/2;
//        int index2 = count/2;
//        int count2 = (count % 2 == 1) ? count/2+1 : count/2;
//        List durations = new ArrayList<>();
//        List users = new ArrayList<>();
//        if(count > 3){
//
//            sort1(index1, count1);
//            sort1(index2, count2 );
//
//            int j = 0;
//            int k = 0;
//            for(int i=0; i < count1+count2; i++){
//                if( index1 < index1+count1 && index2 < index2+count2 ){
//
//                }else if(index1 >= index1+count1){
//                    while( index2 < index2+count2 ){
//                        durations.add( durations.get(index2) );
//                        users.add( users.add(index2) );
//                        index2++;
//                    }
//                }
//                int nb1 = (int)durations.get(index1);
//                int nb2 = (int)durations.get(index2);
//
//                if( nb1 == nb2 ){
//                    String user1 = (String)users.get(index1);
//                    String user2 = (String)users.get(index2);
//
//                    if( isFirstMin(user1, user2) ){
//                        list.add(i);
//                        index1++;
//                    }else{
//                        list.add(i);
//                        index2++;
//                    }
//                }else{
//
//                }
//
//
//            }
//
//        }else{
//
//        }
//
//
//
//    }
//
//    public boolean isFirstMin(String user1, String user2){
//        for(int i=0; i < user1.length(); i++){
//            if( user1.charAt(i) == user2.charAt(i) ) continue;
//            return ( user1.charAt(i) < user2.charAt(i) ) ? true : false;
//        }
//        System.out.println("isFirstMinException");
//        return true;
//    }
//
//    public void initiation(int[] duration, String[] user){
//        for(int i=0; i < duration.length; i++){
//            durations.add(duration[i]);
//            users.add(user[i]);
//        }
//    }
//
//    public Map saveIndex(){
//
//        Map map = new HashMap<>();
//        for(int i=0; i < users.size(); i++){
//            if( !map.containsKey(users.get(i)) ){
//                map.put(users.get(i), new ArrayList<>().add(i));
//            }else{
//                List list = (List)map.get(users.get(i));
//                list.add(i);                                //순서저장 맵에 중복되는 이름의 Index 추가
//                int sameIndex = (int)list.get(0);
//                int sum = (int)durations.get(sameIndex) + (int)durations.get(i);
//                durations.remove(i);                        //중복되는 값 제거
//                users.remove(i);                            //중복되는 유저 제거
//                durations.add(sameIndex, sum);              //중복되는 value 더하고 저장.
//
//            }
//        }
//        return map;
//    }
//}
