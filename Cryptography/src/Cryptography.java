public class Cryptography {

    public long encrypt(int[] numbers){
        int minIndex = searchMinNumber(numbers);
        numbers[minIndex]++;

        long multipleResult = 1L;
        for(int i = 0; i < numbers.length; i++){
            multipleResult *= numbers[i];
        }

        return (long)multipleResult;
    }

    public int searchMinNumber(int [] numbers){
        int minNumber = numbers[0];
        int minIndex = 0;
        for(int i = 1; i < numbers.length; i++){
//            minNumber = Math.min(minNumber, numbers[i] );
            if(minNumber > numbers[i]){
                minNumber = numbers[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static void main(String[] args) {
//        int [] numbers={1, 3, 2, 1, 1, 3};
//        int [] numbers={1000, 999, 998, 997, 996, 995};
        int [] numbers={1 , 1, 1,1};
        Cryptography ctp = new Cryptography();

        System.out.println("Return : "+ctp.encrypt(numbers));
    }

}
