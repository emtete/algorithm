import java.util.*;

/**
 * Created by victor on 2016. 7. 11..
 */
public class HamiltonPath {

    int[] failCount = null;

    public int countPaths(String[] roads){
        int n = roads.length;
        String no = createN(n);
        failCount = new int[n];
        int result = compare(roads, no);
        for(int a : failCount) if( a > 2) return 0;
        return result;
    }

    public String createN(int length){
        String no = "";
        for(int i=0; i < length; i++) no += "N";

        return no;
    }

    public int compare(String[] roads, String no){
        int free = 0;
        int cg = 0; // countGroup
        List groupList = new ArrayList<>();

        for(int i=0; i < roads.length; i++){
            if( roads[i].equals(no) ){
                free++;
            }else{
                boolean isDone = false;

                for(int j=0; j < groupList.size(); j++){

//                    System.out.println( ((Set)groupList.get(j)).contains(i) + " - " + i );
//                    Iterator iter = ((Set)groupList.get(j)).iterator();
//                    while(iter.hasNext()) System.out.print(iter.next()+" ");
//                    System.out.println();

                    if( ((Set)groupList.get(j)).contains(i) ){
                        isDone = true;
                        break;
                    }
                }
                if(isDone) continue;

                groupList.add( countGroup(roads, -1, i, new HashSet<>()) );
                if( groupList.get(groupList.size()-1) == null ) return 0;
            }
        }

        cg = groupList.size();
//        System.out.println("free : "+free);
//        System.out.println("groupCount : "+cg);
//        System.out.println("(fectorial(free+cg) : "+(fectorial(free+cg)) ) ;
//        System.out.println("groupList.size : "+groupList.size());
        return (int)(fectorial(free+cg) * (long)Math.pow( 2, cg ) % (long)1000000007);

    }

    public long fectorial(int n){
        long result = 1;

        while( n > 1 ){
            result = result * n-- % 1000000007;
        }
        return result;
    }

    public Set countGroup(String[] roads, int before, int next, Set set){
        set.add(next);
        for(int i=0; i < roads.length; i++){
            if(roads[next].charAt(i) == 'Y'){
                if( ++failCount[next] > 2 ) return null;
                if(i != next && i != before){
                    if(set.contains(i)) return null;                 //부분원 체크
                    countGroup(roads, next, i, set);
                }
            }
        }
        return set;
    }

}
