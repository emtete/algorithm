public class FriendScore {

    public int highestScore(String[] friends){
        int total = 0;
        int friendsScore = 0;

        for(int i=0; i < friends.length; i++){
            for(int j=0; j < friends.length; j++){
                if( i != j ){ // 자기자신과 비교하지 않는다.

                    if( friends[i].charAt(j) == 'Y' && friends[j].charAt(i) == 'Y' ){
                        friendsScore++;

                        for(int k = 0; k < friends.length; k++){
                            if( (k != i) && (k != j)
                                                     &&  !( (friends[i].charAt(k) == 'Y') && (friends[k].charAt(i) == 'Y') )
                                                     &&   ( (friends[j].charAt(k) == 'Y') && (friends[k].charAt(j) == 'Y') )
                                                                                                                            ){
                                friendsScore++;
                            }
                        }//for
                    }//if

                }//if
            }
            total = Math.max(total, friendsScore); //다음 비교를 위해 초기화
            friendsScore = 0;
        }

        return total;
    }

    public static void main(String[] args) {
//        String [] friends = {   "NYY",
//                                "YNN",
//                                "YNN"  };
//        String [] friends = {"NYNNN", "YNYNN", "NYNYN", "NNYNY" , "NNNYN" };


        String [] friends = {   "NNNNYNNNNN",
                                "NNNNYNYYNN",
                                "NNNYYYNNNN",
                                "NNYNNNNNNN",
                                "YYYNNNNNNY",
                                "NNYNNNNNYN",
                                "NYNNNNNYNN",
                                "NYNNNNYNNN",
                                "NNNNNYNNNN",
                                "NNNNYNNNNN" };
        FriendScore score = new FriendScore();
        System.out.println( score.highestScore(friends) );
    }
}
