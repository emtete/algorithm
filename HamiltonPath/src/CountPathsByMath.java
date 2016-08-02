import java.util.*;

/**
 * Created by victor on 2016. 6. 11..
 */
public class CountPathsByMath {
    int[] failCount;
    Set<Integer> anotherGroup;

    public int countPaths(String[] roads){

        failCount = new int[roads.length];

        List<Set<Integer>> groupList = makeGroup(roads);
        if( checkCircleFail( groupList ) ) return 0;
        if( checkFail(failCount) ) return 0;

        return calculateFectorial(groupList) ;
    }

    public boolean checkFail(int[] failCount){
        for(int i=0; i < failCount.length; i++){
            if(failCount[i] > 2){
                return true;
            }
        }
        return false;
    }

    public boolean checkCircleFail(List<Set<Integer>> groupList){

        boolean isCircle = true;

        for(int i=0; i < groupList.size(); i++){  //circle fail check
            Set<Integer> set = groupList.get(i);
            Iterator iterator =  set.iterator();

            while(iterator.hasNext()){
                int city = (int)iterator.next();
                if( failCount[city] < 2 ) isCircle = false;
            }
        }
        return isCircle;
    }

    public void makeGroupBr(String[] roads) {
        for (int i = 0; i < roads.length; i++) {
            for (int j = 0; j < roads.length; j++) {

            }
        }
    }

    public List makeGroup(String[] roads){
        List<Set<Integer>> groupList = new ArrayList<Set<Integer>>();

        for(int i=0; i < roads.length; i++){        //꼭 가야하는 경로 set에 저장
            String road = roads[i];
            for(int j=0; j < road.length(); j++){
                if( road.charAt(j) == 'Y'){

                    Set<Integer> set = new HashSet<Integer>();
                    set.add(i);
                    set.add(j);
                    boolean alreadyExist = false;

                    for(int k=0; k < groupList.size(); k++){
                        Set<Integer> subGroup = groupList.get(k);
                        if( subGroup.containsAll(set) ){
                            alreadyExist = true;
                        }
                    }
                    if(alreadyExist) continue;

                    groupList.add(set);

                    failCount[i]++;
                    failCount[j]++;
                }
            }
        }

        for(int i=0; i < groupList.size()-1; i++){ //겹치는 경로 합치기
            for(int j=i+1; j < groupList.size(); j++){
                Set<Integer> subGroup1 = groupList.get(i);
                Set<Integer> subGroup2 = groupList.get(j);
                Set<Integer> tempGroup = new HashSet<Integer>();

                Iterator iterator = subGroup1.iterator();
                while(iterator.hasNext()){
                    tempGroup.add((int)iterator.next());
                }

                tempGroup.retainAll(subGroup2);

                if( tempGroup.size() > 0 ){

                    subGroup1.addAll(subGroup2);

                    groupList.remove(i);
                    groupList.remove(j-1); // i를 삭제하므로 -1해야함
                    groupList.add(i, subGroup1);

                    //리스트의 갯수가 수정되면 index값도 수정해서 비교반복해야한다.
                    i--;
                }
            }
        }

        anotherGroup = new HashSet<Integer>(); // 꼭 지나야 하는 길 이외의 나머지
        for(int i=0; i < roads.length; i++){
            anotherGroup.add(i);
        }

        for(int i=0; i < groupList.size(); i++){    // 꼭 지나야 하는 길 이외의 나머지
            Set<Integer> subGroup = groupList.get(i);
            anotherGroup.removeAll(subGroup);
        }

    return groupList;
    }

    public int calculateFectorial(List<Set<Integer>> groupList){
        long result = 1L;
        for(int i=0; i < groupList.size(); i++){
            Set<Integer> subGroup = groupList.get(i);

            if(subGroup.size() > 1){
                result *= 2;
            }
        }
        // calculate anotherGroup
        if( anotherGroup.size() != 0 ){
            for(int j=anotherGroup.size(); j > 1; j--){
                result *= j;
            }
        }

        int index = ( anotherGroup.size() == 0 ) ? groupList.size() : groupList.size() + 1;
        for(int i=index; i > 1; i--){
            result *= i;
        }
        return (int)result % 1000000007;
    }
}
