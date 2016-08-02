import java.util.ArrayList;

//        비내림차순으로 정렬되어있는 배열 s
//        배열 s의 차수 n
//        찾고싶은 값 x
//
//        반으로 나누어진 위치값 d
//        d의 변하기 전 값 p
//        d와 비교하기 위한 값 flag
//        다음 중간값을 계산하는 값 diffrence

//효율계산
//
//        이분검색이므로
//        2로 나눠지지 않을 때까지 검색하게 된다.
//        그러면 2의 제곱으로 만들어질 수 있는 수로 예를들어 생각해보면
//        32개 있는 배열은 총 5번이면 계산이 끝난다.
//        그걸 수식으로 표현하면
//
//        n/2^x?

public class Main {

    static int count = 0;
    public static int dividingSearch(int x){
        int [] s = new int[]{-5, -4, -3, -2, -1, 0,0,0,1,1,1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = s.length;

        int d = (n/2);
        int p = 0;
        int diffrence = -1;
        int temp = 0;                   //toChange
        int flag = (x < s[d])?  0 : n-1;




        while(x != s[d] && diffrence != 0 ){
            count++;
            if (x < s[d]) {
                if (flag > d) {
                    flag = p;
                }
                diffrence = (d - flag) / 2;
                temp = d;
                d = flag + diffrence;
                p = temp;
            } else {
                if (flag < d) {
                    flag = p;
                }
                diffrence = (flag - d) / 2;
                temp = d;
                d = flag - diffrence;
                p = temp;
            }
        }
        return d;
    }

    public static void main(String[] args) {
        int x = 10;

        System.out.println("result index is "+dividingSearch(x));
        System.out.println("runtime is - "+count);

    }
}
