public class Knapsack {



    public static void main(String[] args) {
        int[] weight={3, 4, 1, 2, 3};
        int[] value={2, 3, 2, 3, 6};

//        SumUpMaxValueByBit bit = new SumUpMaxValueByBit();
//        int result = bit.sumUpMaxValueByBit(weight, value);
//        System.out.println(result);


        SumUpMaxValueByRecursion recursion = new SumUpMaxValueByRecursion(weight, value);
        int result = recursion.sumUpMaxValueByRecursion();
        System.out.println(result);

    }
}
