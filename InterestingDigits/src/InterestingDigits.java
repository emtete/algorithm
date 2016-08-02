import java.util.ArrayList;


public class InterestingDigits {

    // 임의의 수는 n진수보다 작다.

    public int[] createOptionalNumber(int base){
        int count = 0;
        int [] resultNumbers = new int[10];

        for(int optionalNumber = 2; optionalNumber < base; optionalNumber++){
            //System.out.println(optionalNumber);
            double maxNumber = createMaxNumber(base);

            if( createMultipleNumber(optionalNumber, maxNumber, base) == true){
                resultNumbers[count] = optionalNumber;
                count++;
            }
        }
        int i = 0;
        while(resultNumbers[i] != 0) i++;
        int [] result = new int[i];
        for(int j = 0; j < i; j++){
            result[j] = resultNumbers[j];
        }

        return result;
    }

    public boolean createMultipleNumber(int optionalNumber, Double maxNumber, int base){
        double optionalNumberD = optionalNumber + 0D;
        double multipleNumber = 0D;

//        boolean flag = true;

        for(double i=1; i <= maxNumber; i++){
            multipleNumber = optionalNumberD * i;
            if( !judgeWhetherMultiple(optionalNumber, multipleNumber, base) ){
                return false;
            }
        }

        return true;
    }

    // 임의의 수의 배수는 4자리수 이하의 곱으로 만든다.
    // 이 메소드는 n진수의 3자리수 중 최대값을 만든다.
    // 최대값을 10진수로 리턴한다.
    public Double createMaxNumber(int base){
        Double maxNumber = 0D;
        for(int i=0; i < 3; i++){
            maxNumber += (base - 1) * Math.pow(base,i);
        }
        return maxNumber;
    }


    public boolean judgeWhetherMultiple(int optionalNumber, double multiple, int base){
        double sum = sumUpDigit(multiple, base);
//        if{
//            return true;
//        }
        return ( sum % optionalNumber == 0 );
    }

    //10진수를 n진수로 바꿔서 각 자리수의 합을 구한다.
    public double sumUpDigit(double multiple, double base){
        double remainder = 0;                        //remainder : 나머지
        remainder = multiple % base;
        multiple = Math.floor(multiple / base);

        if(multiple >= 2){
            return sumUpDigit(multiple, base) + remainder;
        }else{
            return multiple + remainder;
        }
    }

    public int[] digits(int base){

        return createOptionalNumber(base);
    }


    public static void main(String[] args) {
        InterestingDigits digit = new InterestingDigits();


        int [] numbers = digit.digits(10);
        for( int i=0; i < numbers.length; i++ ){
            System.out.print(numbers[i]+", ");
        }

//        digit.digits(10);

    }
}
