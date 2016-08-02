import java.util.ArrayList;
import java.util.List;

/**
 * Created by victor on 2016. 7. 5..
 */
public class NomalSort1 {
    List list = new ArrayList();
    String targets[];

    public String[] spliteString(String target){
        return target.split(" ");
    }

    public NomalSort1(){
        list.add(new ArrayList());
        list.add(new ArrayList());
        targets = new String[2];
    }

    public int compare(String target){
        targets = spliteString(target);
        int result = 0;

        divideString(0);
        divideString(1);

        List<String> list1 = (List)this.list.get(0);
        List<String> list2 = (List)this.list.get(1);

        int length1 = list1.size();
        int length2 = list2.size();

        for(int i=0; i < length1 && result == 0; i++){
            String target1 = list1.get(i);
            String target2 = list2.get(i);
            int slength1 = target1.length();
            int slength2 = target2.length();
            String nextTarget1 = (i < length1-1 ) ? list1.get(i+1) : "" ;
            String nextTarget2 = (i < length2-1 ) ? list2.get(i+1) : "" ;

            boolean flag1 = checkNumber(0, target1, nextTarget1);
            boolean flag2 = checkNumber(0, target2, nextTarget2);
            System.out.println(flag1);
            System.out.println(flag2);
            if( target1.equals( target2 ) ){
                continue;
            }else{
                if( flag1 != flag2 ){
                    result = ( flag1 ) ? -1 : 1;
                }else if(flag1 && flag2){
                    result = compareNumber(target1, target2);
                }else{
                    int index = Math.min(slength1, slength2);
                    for(int j=0; j < index; j++){
                        if( target1.charAt(j) != target2.charAt(j) ){
                            result = (target1.charAt(j) < target2.charAt(j)) ? -1 : 1;
                            break;
                        }
                    }
                    if(slength1 != slength2 && result == 0){
                        result = ( slength1 < slength2 ) ? -1 : 1;
                    }
                }


            }
        }

        return result;
    }

    public int compareNumber(String target1, String target2){

        target1 = deleteZero(target1);
        target2 = deleteZero(target2);
        System.out.println(target1);
        System.out.println(target2);
        System.out.println('-');

        if( target1.charAt(0) == '0' && target2.charAt(0) == '0') return 0;
        int result = checkOperator(target1.substring(0,2), target2.substring(0,2));
        if( result != 0 ) return result;

        if(target1.length() != target2.length()){
            if( target1.charAt(0) == '-' ) return (target1.length() > target2.length() ) ? -1 : 1;
            return (target1.length() < target2.length() ) ? -1 : 1;
        }else{
            for(int i=0; i < target1.length(); i++){
                if( target1.charAt(i) == target2.charAt(i) ) continue;
                if( target1.charAt(0) == '-' ) return ( target1.charAt(i) > target2.charAt(i) ) ? -1 : 1;
                return ( target1.charAt(i) < target2.charAt(i) ) ? -1 : 1;
            }
        }


        return 0;
    }


    // 부호가 같으면 0
    // 다르면 -1, 1
    public int checkOperator(String tg1, String tg2){
        int nb1 = Integer.parseInt(tg1);
        int nb2 = Integer.parseInt(tg2);
        if( tg1.charAt(0) == tg2.charAt(0) ) return 0;
        if( tg1.charAt(0) == '-' ) return -1;
        if( tg2.charAt(0) == '-' ) return 1;
        return 0;
    }

    public String deleteZero(String target){
        int i=0;
        String operator = "";
        if( isOperator(target.charAt(i)) ){
            operator = target.charAt(i)+"";
            ++i;
        }
        while(target.length() > i && target.charAt(i) == '0'){
            ++i;
        }
        if( target.length() == i) return "0";
        if( operator == "" ) operator = '+'+"";
        return operator+target.substring(i);

    }


    public boolean checkNumber(int i, String target, String nextTarget){
        //not number
        //not +, -
        if( isOperator(target.charAt(i))  ){
            if( isNumber(target.charAt(i+1)) ){
                if("".equals(nextTarget)) return true;
                if( isOperator(nextTarget.charAt(0)) ) return false;
                return true;
            }
            return false;
        }else if( isNumber(target.charAt(i)) ){
            if("".equals(nextTarget)) return true;
            if( isOperator(nextTarget.charAt(0)) ) return false;
            return true;
        }

        return false;
    }

    public void divideString(int index){
        if(targets[index].length() == 0) return;

        String target = targets[index];
        int length = target.length();
        List list = (List)this.list.get(index);

        char c = target.charAt(0);

        int i = 1;

        if(c == '+' || c == '-' || (48 <= c && c <= 57)){
            while( i < length && isNumber(target.charAt(i)) ){
                ++i;
            }

            String temp = target.substring(0,i);
            list.add( temp );
            targets[index] = (temp.equals(target)) ? "" : target.substring(i) ;
        }else{
            while( i < length && !isNumber(target.charAt(i)) ){
                i++;
            }
            c = target.charAt(i-1);
            char d = (i-1 <= length-2) ? target.charAt(i) : 'A';
            if( i-1 <= length-2 && isOperator( c ) && isNumber( d ) ) --i;

            String temp = target.substring(0,i);
            list.add( temp );
            targets[index] = (temp.equals(target)) ? "" : target.substring(i) ;

        }
        if( length == targets[index].length() ) return;
        if( targets[index].length() > 0 ) divideString(index);

    }

    public boolean isNumber(char c){
        return (48 <= c && c <= 57);
    }
    public boolean isOperator(char c){
        return (c == '+' || c == '-');
    }
}
