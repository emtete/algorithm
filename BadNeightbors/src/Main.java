public class Main {

    public static void main(String[] args) {
        MaxDonations md = new MaxDonations();
//        int[] donations ={ 10, 3, 2, 5, 7, 8 };
//        int[] donations ={ 11, 15 };
//        int[] donations ={ 7, 7, 7, 7, 7, 7, 7 };
        int[] donations ={1, 2,3,4,5,1,2,3,4,5 };
//        int[] donations ={94, 40, 49, 65, 21, 21, 106, 80, 92, 81, 679, 4, 61, 6, 237, 12, 72, 74,
//                29,95,265,35,47,1,61,397,52,72,37,51,1,81,45,435,7,36,57,86,81,72 };
        int result = md.maxDonations(donations);
        System.out.println(result);
    }
}
