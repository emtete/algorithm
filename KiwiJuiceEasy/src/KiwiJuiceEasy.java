public class KiwiJuiceEasy {

    public int[] thePouring(int[] capacities, int[] bottles, int[] fromld,
                            int[] told){

        for(int i = 0; i < fromld.length ; i++){

            int Total = bottles[ fromld[i] ] + bottles[ told[i] ];

            if(capacities[ told[i] ] >= Total){
                bottles[ told[i] ] = Total;
                bottles[ fromld[i] ] = 0;
            }else{
                bottles[ fromld[i] ] = Total - capacities[ told[i] ];
                bottles[ told[i] ] = capacities[ told[i] ];
            }
        }

        return bottles;
    }

    public static void main(String[] args) {

        int[] capacities = {14, 35, 86, 58, 25, 62} ;
        int[] bottles ={6, 34, 27, 38, 9, 60} ;
        int[] fromId ={1, 2, 4, 5, 3, 3, 1, 0};
        int[] toId ={0, 1, 2, 4, 2, 5, 3, 1};

        KiwiJuiceEasy easy = new KiwiJuiceEasy();
        bottles = easy.thePouring(capacities, bottles, fromId, toId);

        System.out.print("Returns : {");
        for(int i=0; i < bottles.length; i++){
            if(bottles.length != i+1){
                System.out.print(bottles[i]+",");
            }else{
                System.out.print(bottles[i]);
            }
        }
        System.out.println("}");
    }
}
