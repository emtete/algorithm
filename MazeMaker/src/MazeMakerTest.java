//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
///**
// * Created by victor on 2016. 5. 24..
// */
//public class MazeMakerTest {
//
//    @Test
//    public void testFindGoal(){
//        String[] maze1 = {"...",
//                "...",
//                "...",
//                "..."};
//        String[] maze2 = {    "x.x",
//                              "...",
//                              "xxx",
//                              "x.x"};
//
//        String[] maze3 = {  ".......",
//                            "x.x.x..",
//                            "xxx...x",
//                            "....x..",
//                            "x....x.",
//                            "......." };
//
//        String[] maze4 = {"......."};
//        String[] maze5 = {"..X.X.X.X.X.X."};
//
//        MazeMaker mazeMaker = new MazeMaker();
//        int[] goal = mazeMaker.findGoal(maze5, 0, 0);
//
//        assertEquals(goal[0], 0);
//        assertEquals(goal[1], 13);
//    }
//}