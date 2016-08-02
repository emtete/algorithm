/**
 * Created by victor on 2016. 5. 28..
 */
public class SumUpMaxValueByBit {
    public int sumUpMaxValueByBit(int[] weight, int[] value){

        int maxValue = 0;
        int numberOfProduct = weight.length;
        double numberOfCase = Math.pow(2, numberOfProduct);

        for(int i=0; i < numberOfCase; i++){
            int sumUpValue = 0;
            int sumUpWeight = 0;

            char [] binary = createBinary(i);

            for(int j=0; j < numberOfProduct; j++){
                if( binary[ numberOfProduct - j - 1 ] =='1'){

                    sumUpWeight += weight[j];
                    sumUpValue += value[j];
                }
            }

            if( sumUpWeight <= 10 ){
                maxValue = Math.max(maxValue, sumUpValue);
            }

        }
        return maxValue;
    }


    // 10진수 i를 5자리 2진수로 변환
    public char[] createBinary(int i){

        int numberOfBinaryString = Integer.toBinaryString(i).length();
        String binaryString = "";
        for(int k = 0; k < 5-numberOfBinaryString ; k++) binaryString+=0;
        binaryString += Integer.toBinaryString(i);
        char[] binary = binaryString.toCharArray();

        return binary;
    }
}
