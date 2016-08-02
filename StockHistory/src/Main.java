public class Main {

    public static void main(String[] args) {
        MaximumEarnings me = new MaximumEarnings();
//        String[] stockPrices = {"10 20 30", "15 24 32"};
//        int result = me.maximumEarnings(1000, 0, stockPrices);
//        String[] stockPrices = {"10", "9"};
//        int result = me.maximumEarnings(1000, 0, stockPrices);
        String[] stockPrices = {"40 50 60",
                                "37 48 55",
                                "100 48 50",
                                "105 48 47",
                                "110 50 52",
                                "110 50 52",
                                "110 51 54",
                                "109 49 53" };

        int result = me.maximumEarnings(100, 20, stockPrices);
        System.out.println(result);
    }
}
