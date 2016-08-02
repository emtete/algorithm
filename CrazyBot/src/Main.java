import java.util.Scanner;

public class Main {

    static double sumOfProbability = 0D;
    static int [][] pastPath = null;

    public double getProbability(int n, int east, int west, int south, int north){
        pastPath = new int[n][2];
        findRoot(1, n+1, east, west, south, north, 0, 0, 1);
        return sumOfProbability;
    }

    public int findRoot(int times, int n, int east, int west, int south, int north, int garo, int sero, double currentProbability){

        int index = 0;

        for(int i=0; i < times-1; i++){
            if( (pastPath[i][0] == garo) && (pastPath[i][1] == sero) ){
                return 0;
            }
        }
        if(n <= 1){
            sumOfProbability += currentProbability;
            return 0;
        }else{

            if(times >= 1){
                index = times -1;
                pastPath[index][0] = garo;
                pastPath[index][1] = sero;
            }

            if(east != 0D)findRoot(times+1, n-1, east, west, south, north, garo+1, sero, currentProbability * east * 0.01D);
            if(west != 0D)findRoot(times+1, n-1, east, west, south, north, garo-1, sero, currentProbability * west * 0.01D);
            if(south != 0D)findRoot(times+1, n-1, east, west, south, north, garo, sero-1, currentProbability * south * 0.01D);
            if(north != 0D)findRoot(times+1, n-1, east, west, south, north, garo, sero+1, currentProbability * north * 0.01D);

        }

        return 0;
    }


    //확률리턴방식 생각하기
    // 메소드 안에 메소드 또 쓰는것 앞에 return 안붙여도 되는지 생각하기.


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String message = scan.nextLine();

        String [] direction = message.split(" ");
        int [] ds = new int[5];  //directions
        int i = 0;
        for(String s : direction){

            ds[i] = Integer.parseInt(s);
            i++;
        }

        Main bot = new Main();


        bot.getProbability(ds[0],ds[1],ds[2],ds[3],ds[4]);
//        bot.getProbability(1,25,25,25,25);
//        bot.getProbability(2,25,25,25,25);
//        bot.getProbability(7,50,0,0,50);
//        bot.getProbability(14,50,50,0,0);
//        bot.getProbability(14,25,25,25,25);
        System.out.println(sumOfProbability);
    }

}
