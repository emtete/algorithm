import java.util.Scanner;

public class Main {

    public char[] scan(){
        String message;
        Scanner scan = new Scanner(System.in);      // 문자 입력을 인자로 Scanner 생성

        System.out.print("제품키를 입력하세요:");

        message = scan.nextLine();

        return message.toCharArray();
    }

    public void judgement(char[] charArray){
        int count = 0;
        char judgementChar = '0';
        int bunch = -1;

        char [] result = new char[32];
        int resultIndex = 0;


        for(int i=0; i < charArray.length; i++){
            int charInt = (int)charArray[i];

            if( (charInt >= 48 && charInt <= 57) ||
                (charInt >= 65 && charInt <= 90)    ){

                count++;
            }else{
                count = 0;
            }

            if(count == 5) {
                int startIndex = i - 4;
                bunch++;
                char[] middleResult = new char[5];
                if (operation(charArray, startIndex, judgementChar)) {
                    middleResult = saveResult(charArray, startIndex);
//                    for(int j =0; j < 6; j++){
                    if (bunch < 24) {
                        for (int k = 0; k < 6; k++) {

                            if (k != 5) {
                                result[bunch] = middleResult[k];
                                bunch++;


                            } else {
                                result[bunch] = '-';
                                bunch++;
                            }
                        }
                    } else if(bunch == 24) {
                        for (int k = 0; k < 5; k++) {
                            result[bunch] = middleResult[k];
                            bunch++;

                        }
                    }else if(bunch == 29){
                        for(char a : result){
                            System.out.print(a);

                        }
                        System.out.println();

                        judgementChar = '0';
                        result = new char[29];
                        bunch = -1;

                    }
                } else {
                    bunch--;
                }
            }







            }



    }

    public boolean operation(char[] charArray, int startIndex, char judgementChar){
        char [] middleResult = new char[5];
        boolean flag = false;
        int judgementInt = (int)judgementChar ;

        if( (judgementInt >= 48 && judgementInt <= 57) ){
            judgementInt = judgementInt - 48;
        }else if(judgementInt >= 65 && judgementInt <= 90){
            judgementInt = judgementInt - 55;
        }



        for(int i = 0; i < 5; i++){
            middleResult[i] = charArray[startIndex + i];
        }
        int [] middleResultInt = new int[5];

        for(int i = 0; i < 5; i++){

            int charInt = (int)middleResult[i];

            if( (charInt >= 48 && charInt <= 57) ){
                middleResultInt[i] = charInt - 48;


            }else if(charInt >= 65 && charInt <= 90){
                middleResultInt[i] = charInt - 55;
            }
        }

        int result = ( middleResultInt[0] * 2 +
                        middleResultInt[1] * 3 +
                        middleResultInt[2] * 5 +
                        middleResultInt[3] * 7 +
                        middleResultInt[4] * 11) % 36;

        if( result == judgementInt ){
            flag = true;
            judgementChar = middleResult[4];
        }
        return flag;
    }


    public char[] saveResult(char [] charArray, int startIndex){
        char [] middleResult = new char[5];

        for(int i = 0; i < 5; i++){
            middleResult[i] = charArray[startIndex + i];
        }
        return middleResult;

    }

    public static void main(String[] args) {
        Main main = new Main();
        char [] charArray = main.scan();
        main.judgement(charArray);

        //char a = '9';
//        if(charArray[0] == 'A'){
            //System.out.println( (int)a );



//        for(char a : charArray){
//            System.out.print(a);
//        }
    }
}
