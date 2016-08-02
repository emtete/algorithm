public class Main {

    public static void sortingAlphabet(){
        String string = "abcdefg";
        char [] stringArray = string.toCharArray();

    }

    public static int dividingSearch(char[] stringArray, char x){
        int n = stringArray.length;
        int high = n-1;
        int low = 0;

        int mid =0;
        int location = 0;
        int flag = 0;

        while( low <= high && location == 0){
            mid = 2*(high + low)/2;

            if( (int)x == (int)stringArray[mid] ){
                location = mid;
            }else if( (int)x < (int)stringArray[mid] ){
                high = mid - 1;
                flag = 2*(high + low)/2;
            }else{
                low = mid + 1;
            }
        }


        return location;
    }

    public static void main(String[] args) {
        String string = "abcdefg";
        char x = 'a';
        char [] stringArray = string.toCharArray();
        System.out.println(dividingSearch(stringArray, x));

        //char [] toSearchCharactor = new char[];
    }
}
