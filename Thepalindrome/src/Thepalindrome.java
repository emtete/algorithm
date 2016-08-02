import java.util.HashMap;
import java.util.Map;

public class Thepalindrome {
//    Map map = new HashMap<String, Integer>();
//
//    //오른쪽부터 검색한다.
//    // if문의 조건이 만족하지 않아도 그 안에 있는 배열의 index가 틀리면 에러가 난다.
//    public int findSameword(char[] char1, int start){
//        int index1 = 0;
//        int index2 = 0;
//        if(start >= 1) {
//            index1 = start;
//            index2 = index1 - 1;
//            if (char1[index1] == char1[index2]) {
//                return findSameword(char1, index2);
//            } else {
//                return start;
//            }
//        }else{
//            return start;
//        }
//    }
//
//    //return 1 : 부분회문
//    //return -1 : 회문이 아님
//    //return 0 : 완전회문
//    //return -2 : 회문 없음
//
//    public int compareWing(char [] char1, int rightWingIndex, int leftWingIndex) {
//
//        if (leftWingIndex >= 0) {
//
//
//            if (char1[rightWingIndex] == char1[leftWingIndex]) {
//                map.put("rightWingIndex", rightWingIndex);
//                map.put("leftWingIndex", leftWingIndex);
//                if (char1.length - 1 > rightWingIndex && leftWingIndex > 0) {
//                    return compareWing(char1, rightWingIndex + 1, leftWingIndex - 1);
//                }
//                if (char1.length - 1 == rightWingIndex && leftWingIndex == 0) {
//                    return 0;
//                } else if (rightWingIndex <= 1 || leftWingIndex <= 0) {
//                    return -2;
//                } else if (char1.length - 1 == rightWingIndex) {
//                    return 1;
//                } else {
//                    return -2;
//                }
//                //return compareWing(char1, rightWingIndex+1, leftWingIndex-1);
//            } else {
//                if (rightWingIndex <= 2) {
//                    return -2;
//                } else {
//                    return -1;
//                }
//            }
//        }else{
//            return -2;
//        }
//    }
//
//    public int findSeed(char [] char1, int rightWingIndex, int leftWingIndex, int firstSameCount, int middleResult){
//        int compareResult = compareWing(char1, rightWingIndex, leftWingIndex);
//        int newResult = 50;
//        switch(compareResult){
//            case -1 : // 다시검색
//                rightWingIndex = findSameword(char1, rightWingIndex-1);
//                leftWingIndex = findSameword(char1, rightWingIndex-1) - 1;
//
//                return findSeed(char1, rightWingIndex, leftWingIndex, firstSameCount, middleResult);
//
//            case -2 : // 회문 없음
//                newResult = char1.length - firstSameCount + char1.length;
//                middleResult = (middleResult > newResult ) ? newResult : middleResult;
//                return middleResult;
//            case 0 : // 완전회문
//                return char1.length;
//            case 1 : // 부분회문
//                int rightWing = ( (Integer)map.get("rightWingIndex") ).intValue();
//                int leftWing = ( (Integer)map.get("leftWingIndex") ).intValue();
//
//                newResult = char1.length - ( rightWing - leftWing + 1) + char1.length;
//                middleResult = (middleResult > newResult ) ? newResult : middleResult;
//                rightWingIndex = rightWingIndex -1;
//                leftWingIndex = findSameword(char1, rightWingIndex-1) -1;
//                return findSeed(char1, rightWingIndex, leftWingIndex, firstSameCount, middleResult);
//
//            default:
//                return 100; //에러
//        }
//    }
//
//    public int find(String s){
//        char [] char1 = s.toCharArray();
//        int rightWingIndex = findSameword(char1, char1.length-1); // 맨 오른쪽의 서로 다른 문자가 있는 index
//        int firstSameCount = (char1.length -1) - rightWingIndex + 1; // 맨 오른쪽의 같은 문자의 수
//
//        int leftWingIndex = findSameword(char1, rightWingIndex-1) - 1;
//
//        return findSeed(char1, rightWingIndex, leftWingIndex, firstSameCount, 60);
//    }

//    public char[] changeToArray(String s){
//        return s.toCharArray();
//    }

    public static void main(String[] args) {
//        String s = "abab";
//        String s = "abacaba";
//        String s = "qwerty";
//        String s = "abdfhdyrbdbsdfghjkllkjhgfds";
//        String s = "aaafaaabab";
//
//
//        Thepalindrome the = new Thepalindrome();
//        System.out.println( the.find(s) );

//        String s = "abab";
//        String s = "abacaba";
//        String s = "qwerty";
        String s = "abdfhdyrbdbsdfghjkllkjhgfds";
//        String s = "aaafaaabab";

        Thepalindrome1 tpdm = new Thepalindrome1();
        int result = tpdm.find(s);
        System.out.println(result);
    }
}
