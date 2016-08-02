import java.util.ArrayList;
import java.util.HashSet;

//배열에 있는 친구들
//        취미가 가장 많이 겹치는 친구들을 초대하는데 그 친구수를 리턴한다.
//
//        전체탐색, 순열?
//        겹치지 않는다면 1명
//        어떤 알고리즘으로 친구를 초대할것인가?
//        1. 전체탐색으로 0번친구와 겹치는 친구가 있는지 비교한다. 겹치는 모든 친구들의 다른 취미로 선택되지 않는 친구만 비교해본다.
//        2. 처음 과정에서 겹치지 않는다면 전체탐색에서 제외한다.
//        3. 책 과정( 기초탐색 )에서 n번째 기초탐색과 n+1번째 기초탐색 결과는 서로 다를까?
//        ㄱ. 서로의 취미가 겹칠 때 같다.
//        ㄴ. 서로의 취미가 겹치지 않을 때, 다를 수 있다.
//        ... 전체 탐색으로 전원에게 기초탐색을 해야한다.
//
//        4. 기초탐색을 해서 겹치지 않는 사람은 모두 제외한 다음 다시 for해서 찾을까? / 아니면 처음부터 다 할까? 검색도중 기초탐색에서 0이라면 그 땐 제외시키자.
//
//
//        1. 취미 1로 기초탐색하면 for도중에 겹치는 친구의 취미와 겹치는걸 또 검색할지 for끝나고 결과를 저장하여 또 검색할지
//        ㄱ. 결국 같으나 첫번째 코드가 더 깔끔할 것 같다.
//        2. for 도중 깊이우선 탐색으로 가기로 하고 많은 기초탐색 단위친구들 모두 최대가능 -> count에 저장
//        3. 기초탐색 이후 탐색은 calculate메소드로 한다. 이미 멤버라면 그 멤버와 겹치는 친구는 탐색이 끝났으므로 멤버인 친구는 제외한다.
//        ㄱ. 제외시키는 방법 : 친구 리스트를 만든다. 멤버에 포함되면 친구리스트에서 삭제한다. 기초탐색 이외의 탐색에서 친구리스트를 기준으로 돌린다. 기초탐색 시작시 친구 리스트를 초기화한다.
//        4. 깊이탐색으므로 calculate를 재귀하여 탐색하게 만든다.
//        5. first, second각각 계산되어야 한다. 모든 탐색은 탐색단위별로 first, second 를 비교해야 한다.
//        ㄱ. calculate은
//        6. 두 취미를 비교할 때 or 연산자로 한번에 할 수 있다.



// 위 주석은 문제를 잘못 이해해서 적은 내용이고
// 문제는 그냥 단순히 공통취미가 가장 높은 수를 리턴하는 문제이다.

public class InterestingParty {
    int maxNumber=0;
    public int bestInvitation(String[] first, String[] second){
        HashSet interesting = new HashSet();

        collectInteresting(interesting, first, second);

        return searchMemberNumber(interesting, first, second);



    }

    public void collectInteresting(HashSet interesting, String [] first, String [] second){
        for(int i=0; i < first.length; i++){
            interesting.add(first[i]);
            interesting.add(second[i]);
        }
    }

    public int searchMemberNumber(HashSet<String> interesting, String [] first, String [] second){
        int maxNumber = 0;
        int currentNumber = 0;
        for(String interest : interesting){
            for(int i=0; i < first.length; i++){
                if( interest.equals(first[i])||
                    interest.equals(second[i])    ){
                    currentNumber++;
                }
            }
            maxNumber = ( maxNumber < currentNumber ) ? currentNumber : maxNumber ;
            currentNumber = 0;

        }
        return maxNumber;
    }


    public static void main(String[] args) {
        InterestingParty party = new InterestingParty();
//        String [] first ={"fishing", "gardening", "swimming", "fishing"};
//        String [] second ={"hunting", "fishing", "fishing", "biting"};

//        String [] first ={"variety", "diversity", "loquacity", "courtesy"};
//        String [] second ={"talking", "speaking", "discussion", "meeting"};

//        String [] first ={"snakes", "programming", "cobra", "monty"};
//        String [] second ={"python", "python", "anaconda", "python"};

        String [] first = {"t", "o", "p", "c", "o", "d", "e", "r", "s", "i", "n", "g", "l", "e", "r", "o", "u", "n", "d", "m", "a", "t", "c", "h", "f", "o", "u", "r", "n", "i"};
        String [] second ={"n", "e", "f", "o", "u", "r", "j", "a", "n", "u", "a", "r", "y", "t", "w", "e", "n", "t", "y", "t", "w", "o", "s", "a", "t", "u", "r", "d", "a", "y"};

        System.out.println("Return : "+party.bestInvitation(first, second));


    }
}
