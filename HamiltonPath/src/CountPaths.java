import java.util.ArrayList;

/**
 * Created by victor on 2016. 6. 10..
 */
public class CountPaths {
    int dp[][] = null;
//    int flag = 0;
    int[] lastPath = null;
    int[][] mustRoad = null;
    ArrayList cities = new ArrayList();

    public int countPaths(String[] roads){
        dp = new int[2][roads.length+1];
        lastPath = new int[roads.length];
        mustRoad = new int[ roads.length ][ roads.length ];

        resetDp(2, roads.length+1);
        calculateMustRoads(roads);
        createCity(roads);


        return dfs(0, roads, roads.length, 0);
    }
    public int dfs(int start, String[] roads, int numberOfRemainderCity, int flag){
        int index = roads.length - numberOfRemainderCity;
        int index0 = 0;
        if(index > 1){
            index0 = index-2;
            if( mustRoad[ lastPath[index0] ][ lastPath[index0+1] ] == 1 ) flag = 1;
        }
        if( numberOfRemainderCity == 0 ){
            if(flag == 1){
                return 1;
            }else{
                return 0;
            }
        }
        if( dp[flag][ numberOfRemainderCity ] != -1 && flag == 1 ) return dp[flag][numberOfRemainderCity];


        for(int i=0; i < numberOfRemainderCity; i++){

            lastPath[ index ] = (int)cities.get(i);
            cities.remove(i);

//            if(roads.length > numberOfRemainderCity){
//                index0 = index - 1;
//                if( mustRoad[ lastPath[index0] ][ lastPath[index0+1] ] == 1 ) flag = 1;
//            }


            if( dp[flag][ numberOfRemainderCity ] == -1){
                dp[flag][ numberOfRemainderCity ] += dfs(start+1, roads, numberOfRemainderCity-1, flag) + 1;
            }else{
                dp[flag][ numberOfRemainderCity ] += dfs(start+1, roads, numberOfRemainderCity-1, flag);
            }


//            if(roads.length > numberOfRemainderCity){
//                index0 = index - 1;
//                if( mustRoad[ lastPath[index0] ][ lastPath[index0+1] ] == 1 ) flag = 0;
//            }

            cities.add(i , lastPath[ index ] );
        }


        return dp[flag][ numberOfRemainderCity ];
    }

    public void calculateMustRoads(String[] roads){
        for(int i=0; i < roads.length; i++){
            String road = roads[i];
            for(int j=0; j < road.length(); j++){
                if( road.charAt(j) == 'Y'){
                    mustRoad[i][j] = 1;
                }
            }
        }
    }

    public void createCity(String[] roads){
        for(int i=0; i < roads.length; i++){
            cities.add(i);
        }
    }

    public void resetDp(int first, int second){
        for(int i=0; i < first; i++){
            for(int j=0; j < second; j++){
                dp[i][j] = -1;
            }
        }
    }
}
