public class Main {

    public static void main(String[] args) {
        TotalSalary1 salary = new TotalSalary1();
//        String[] relations = {"N"};
//        String[] relations = {"NNYN", "NNYN", "NNNN", "NYYN"};
//        String[] relations = {"NNNNNN", "YNYNNY" , "YNNNNY", "NNNNNN", "YNYNNN" , "YNNYNN"};
//        String[] relations = {"NYNNYN", "NNNNNN" , "NNNNNN", "NNYNNN" , "NNNNNN", "NNNYYN"};
        String[] relations = {"NNNN", "NNNN" , "NNNN" , "NNNN" };



        long result = salary.totalSalary(relations);
        System.out.println(result);
    }
}
