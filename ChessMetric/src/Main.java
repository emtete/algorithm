public class Main {

    public static void main(String[] args) {
        HowMany hm = new HowMany();
        int[] start = new int[2];
        int[] end = new int[2];
        int numMoves = 0;
        int size = 0;

//        size = 3;
//        start[0] = 0;
//        start[1] = 0;
//        end[0] = 1;
//        end[1] = 0;
//        numMoves = 1;

//        size = 3;
//        start[0] = 0;
//        start[1] = 0;
//        end[0] = 1;
//        end[1] = 2;
//        numMoves = 1;

//        size = 3;
//        start[0] = 0;
//        start[1] = 0;
//        end[0] = 2;
//        end[1] = 2;
//        numMoves = 1;

//        size = 3;
//        start[0] = 0;
//        start[1] = 0;
//        end[0] = 0;
//        end[1] = 0;
//        numMoves = 2;

        size = 100;
        start[0] = 0;
        start[1] = 0;
        end[0] = 0;
        end[1] = 99;
        numMoves = 50;

        long result = hm.howMany(size, start, end, numMoves );
        System.out.println(result);
    }
}
