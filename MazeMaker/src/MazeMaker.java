import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MazeMaker {

//    public int longestPath(String[] maze, int startRow, int startCol, int[] moveRow, int[] moveCol){
//        Queue path = new LinkedList<int[]>();
//
//        int rowLength = maze[0].length();
//        int colLength = maze.length;
//        int[][] pastPath = new int[ rowLength * colLength ][ 2 ];
//        int[] goal = findGoal(maze, startRow, startCol);
//
//        path.offer(new int[]{startRow, startCol});
//        path.offer(new int[]{-1});
//
//        return abc(maze, moveRow, moveCol, /*startRow, startCol,*/ goal, 0, /*queue,*/ path, pastPath, 0);
//    }
//
//    //시작위치를 매개변수로 전달하는 것을 삭제하고 큐로만 전달하는 코드로 수정필요.
//    // 큐로만 전달할 경우 체크가 필요한 부분 : result값
//    // 자료규조가 큐의 쌍으로 되어있는 것 수정필요?
//    public int abc(String [] maze,int[] moveRow, int[] moveCol, /*int nowRow, int nowCol,*/ int[] goal, int count, /*Queue queue,*/ Queue<int[]> path, int [][] pastPath, int result){
//
//
//        if(path.peek() == null) return -1;
//
//        List<Object> list = pullsOut(path, 0);
//        int[] nowPath = (int[])list.get(1);
//        if(nowPath[0] == -2) return -1;
//
//        result += (int)list.get(0);
//        boolean endDepth = ( path.peek()[0] == -1)? true:false;
//
//        int nowRow = nowPath[0];
//        int nowCol = nowPath[1];
//
//        if( (nowRow == goal[0]) && (nowCol == goal[1]) ) return result;
//
//        pastPath[count][0] = nowRow;
//        pastPath[count][1] = nowCol;
//        count++;
//
//        int rowLength = maze.length;
//        int colLength = maze[0].length();
//
////        int countSumOfPath = 0;
////        boolean firstAdd = true;
//        for(int i = 0; i < moveRow.length; i++ ){
//            int willRow = 0;
//            int willCol = 0;
//
//            if( (nowRow + moveRow[i] >= 0) && ( nowCol + moveCol[i] >= 0) &&
//                    ( rowLength-1 >= nowRow + moveRow[i] ) && ( colLength-1 >= nowCol + moveCol[i] )
//                    ){
//
//                willRow = nowRow + moveRow[i];
//                willCol = nowCol + moveCol[i];
//
//                boolean flag = true;
//                if( maze[willRow].charAt(willCol) == 'x' ) continue;
//
//                for(int[] onePath: path){
//                    if( (onePath[0]==willRow) && (onePath[1]==willCol) ) flag = false;
//                }
//
//                for(int j=0; j < count; j++){ // 이동한 길은 제외시키는 코드
//                    if( (pastPath[j][0] == willRow) && (pastPath[j][1] == willCol) ) flag = false;
//
//                }
//
//                if(flag){
//                    path.offer( new int[]{willRow, willCol} );
////                    countSumOfPath++;
//
//                    //testCode
//                    int roadCount = 0;
//                    for(String road : maze){
//                        if(roadCount == willRow){
//                            char []charRoad = road.toCharArray();
//                            charRoad[willCol] = 'v';
//                            road = new String(charRoad, 0, charRoad.length);
//                        }
//                        System.out.println(road);
//                        roadCount++;
//                    }
//                    System.out.println();
//                }
//
//            }
//        }
//        if(endDepth){
////                        firstAdd = false;
//            path.offer(new int[]{-1});
//            System.out.println("-1");
//        }
//
//
//
//        return abc(maze, moveRow, moveCol, /*willPath[0], willPath[1],*/ goal, count, path, pastPath, result);
//    }
//
//    public List<Object> pullsOut(Queue<int[]> path, int result){
//        int[] nowPath = path.poll();
//        List<Object> list = new ArrayList<>();
//        if(nowPath[0] == -1){
//            if( path.peek() != null ){
//                return pullsOut(path, result+1);
//            }else{
//                list.add(result);
//                list.add(new int[]{-2});
//                return list;
//            }
//
//        }else{
//            Object object1 = (Object)nowPath;
//            list.add( result );
//            list.add( object1 );
//            return list;
//        }
//    }
//
//    //출구를 찾는 메소드 ( 넓이 우선 탐색 메소드 )
//    // 1. 시작점에서 가장 먼 위치를 출구로 정한다.
//    // 2. 그 위치가 나무가 아니라면 return 한다.
//    // 3. 나무라면
//    //      (endrow == 0) ? endRow +1 : endRow -1;
//    //      (endCol == 0) ? endCol +1 : endCol -1;
//    // 위 두 경우의 경로를 저장하여 각 경우 이동한다.
//    // 둘다 false면 3을 반복한다.
//    public int[] findGoal(String[] maze, int startRow, int startCol){
//        int rowLength = maze.length;
//        int colLength = maze[0].length();
//        int endRow = ( (rowLength / 2) < startRow ) ?  0 : rowLength-1;
//        int endCol = ( (colLength / 2) < startCol ) ?  0 : colLength-1;
//
//        Queue path = new LinkedList<int[]>();
//        path.offer(new int[]{endRow, endCol});
//
//        return findNTree(maze, endRow, endCol, endRow, endCol, path);
//    }
//
//    public int[] findNTree(String[] maze, int endRow, int endCol,int flagRow, int flagCol, Queue<int[]> path){
//        if( path.peek() == null) return new int[]{-1,-1};
//        if( maze[endRow].charAt(endCol) != 'x' ){
//            return new int[]{endRow, endCol};
//        }else{
//            int goRow = 0;
//            int goCol = 0;
//
//            if(flagRow == 0){
//                if(endRow < maze.length-1){
//                    goRow = endRow+1;
//                    path.offer(new int[]{goRow, endCol});
//                }
//            }else{
//                if(endRow > 0){
//                    goRow = endRow-1;
//                    path.offer(new int[]{goRow, endCol});
//                }
//            }
//
//            if(flagCol == 0){
//                if(endCol < maze[0].length()-1 ){
//                    goCol = endCol+1;
//                    path.offer(new int[]{endRow, goCol});
//                }
//
//            }else{
//                if(endCol > 0 ){
//                    goCol = endCol-1;
//                    path.offer(new int[]{endRow, goCol});
//                }
//            }
//        }
//
//        int[] goal = path.poll();
//
//        return findNTree(maze, goal[0], goal[1], flagRow, flagCol, path);
//    }
//
////    }

    public static void main(String[] args) {

        MazeMaker1 mm = new MazeMaker1();

//        String[] maze1 = {"...",
//                "...",
//                "..."};
//        int[] moveRow1 = {1, 0, -1 , 0};
//        int[] moveCol1 = {0, 1, 0, -1};
//        int result = mm.longestPath(maze1, 0, 1, moveRow1, moveCol1);


//        String[] maze2 = {"...",
//                "...",
//                "..."};
//
//        int[] moveRow2 = {1, 0, -1, 0, 1, 1, -1, -1};
//        int[] moveCol2 = {0, 1, 0, -1, 1, -1, 1,-1};
//        int result = mm.longestPath(maze2, 0, 1, moveRow2, moveCol2);

        String[] maze3 = {    "x.x",
                "...",
                "xxx",
                "x.x"};
        int[] moveRow3 = {1, 0, -1 , 0};
        int[] moveCol3 = {0, 1, 0, -1};
        int result = mm.longestPath(maze3, 0, 1, moveRow3, moveCol3);

//        String[] maze4 = {  ".......",
//                "x.x.x..",
//                "xxx...x",
//                "....x..",
//                "x....x.",
//                "......." };
//        int[] moveRow4 = {1, 0, -1 , 0, -2, 1};
//        int[] moveCol4 = {0, -1 , 0, 1, 3, 0};
//      int result = mm.longestPath(maze4, 5, 0, moveRow4, moveCol4);
//
//        String[] maze5 = {"......."};
//        int[] moveRow5 = {1, 0, 1, 0, 1, 0};
//        int[] moveCol5 = {0, 1, 0, 1, 0, 1};
//        int result = mm.longestPath(maze5, 0, 0, moveRow5, moveCol5);

//        String[] maze6 = {"..x.x.x.x.x.x."};
//        int[] moveRow6 = {2, 0, -2, 0};
//        int[] moveCol6 = {0, 2, 0, -2};
//        int result = mm.longestPath(maze6, 0, 0, moveRow6, moveCol6);

//        MazeMaker mazeMaker = new MazeMaker();




//        int result = mazeMaker.longestPath(maze5, 0, 0, moveRow, moveCol);
//        System.out.println(result);
//        maze.findGoal();



        System.out.println(result);
//        int result = mm.ctr(maze3);
//        System.out.println(result);
    }
}
