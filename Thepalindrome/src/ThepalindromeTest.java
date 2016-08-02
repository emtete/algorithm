//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
///**
// * Created by victor on 2016. 5. 16..
// */
//public class ThepalindromeTest {
//
//    Thepalindrome the = new Thepalindrome();
//
//    String s1 = "abab";
//    char [] char1 = s1.toCharArray();
//    String s2 = "abccc";
//    char [] char2 = s2.toCharArray();
//
//    @Test
//    public void testFindSameword(){
//
//        int result1 = the.findSameword(char1, char1.length-1);
//        int result2 = the.findSameword(char2, char2.length-1 );
//        assertEquals(char1.length-1, result1);
//        //assertEquals(char2.length-1, result2);
//    }
//
//    @Test
//    public void testCompareWing(){
//        int result1 = the.compareWing(char1, 3, 1);
//        int result2 = the.compareWing(char1, 2, 0);
//        assertEquals(1, result1);
//        assertEquals(-2, result2);
//
//    }
//
//    //결과값 달라짐
////    @Test
////    public void testFindSeed(){
////        int result1 = the.findSeed(char1, 3, 1);
////        int result2 = the.findSeed(char2, 2, 0);
////        assertEquals(1, result1);
////        assertEquals(-2, result2);
////    }
//}