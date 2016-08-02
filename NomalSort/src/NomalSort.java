/**
 * Created by victor on 2016. 7. 4..
 */
public class NomalSort {
    public String[] spliteString(String target){
        return target.split(" ");
    }
//48 ~ 57
    //+ , - 앞에 문자이면 뒤는 숫자이다.
    public int compare(String target){
        String targets[] = spliteString(target);
        int result = 0;
        for(int i=0; i < targets.length; i++){

            char char1 = targets[0].charAt(i);
            char char2 = targets[1].charAt(i);
            boolean flag1 = checkNumber(i, targets[0]);
            boolean flag2 = checkNumber(i, targets[1]);

            if( flag1 != flag2 ){
                result = ( flag1 ) ? -1 : 1;
            }else if( flag1 && flag2){

            }


            if( (48 <= char1 && char1 <= 57) && !(48 <= char2 && char2 <= 57) ||
                !(48 <= char1 && char1 <= 57) && (48 <= char2 && char2 <= 57)     ){

                result = (48 <= char1 && char1 <= 57) ? -1 : 1 ;

            }else{


                result = ( char1 < char2 ) ? -1 :
                        ( char1 == char2) ? 0  : 1;
            }
            if( result != 0 ) return result;
        }
        return result;
    }

    public boolean nullCheck(String target1){
        target1 = target1.trim();
        if(target1 == null || target1 == "" ) return true;
        return false;
    }

    public int endCondition(String target1, String target2){
        boolean flag1 = nullCheck(target1);
        boolean flag2 = nullCheck(target2);
        int result = 0;
        if( flag1 && flag2 ){
            result = 0;
        }else if(flag1 != flag2){
            result = (flag1)? -1 : 1;
        }
        return result;
    }

    public int abc(String target1, String target2){
        int result = 0;
        int size1 = target1.length();
        int size2 = target2.length();
        if( size1 == 0 || size2 == 0) return 0;

        char char1 = target1.charAt(0);
        char char2 = target2.charAt(0);
        boolean flag1 = checkNumber(0, target1);
        boolean flag2 = checkNumber(0, target2);

        if( flag1 != flag2 ){
            result = ( flag1 ) ? -1 : 1;
        }else if( flag1 && flag2 ){
//            if(  )
        }else{

        }

        return 0;
    }

    public boolean checkNumber(int i, String target){
        //not number
        //not +, -
        char char1 = target.charAt(i);
        if(char1 == '+' || char1 == '-'  ){
            char1 = target.charAt(i+1);
            if(48 <= char1 && char1 <= 57) return true;
        }else if(48 <= char1 && char1 <= 57){
            return true;
        }else{
            return false;
        }
        System.out.println("checkNumberException");
        return false;
    }

    public void compareNumber(){

    }

}


//    int j = 0;
//do{
//        ++j;
//        char1 = target[0].charAt(j);
//
//        }while( (48 <= char1 && char1 <= 57) && target.length-1 > j );
//
//        if( j < target.length)