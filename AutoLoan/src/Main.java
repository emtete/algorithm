public class Main {

    public static void main(String[] args) {
        InterestRate ir = new InterestRate();
        double price = 6800;
        double monthlyPayment = 100;
        int loanTerm = 68;

//        price = 2000;
//        monthlyPayment = 510;
//        loanTerm = 4;

        price = 15000;
        monthlyPayment = 364;
        loanTerm = 48;

        double result = ir.interestRate(price, monthlyPayment, loanTerm);
        System.out.println(result * 12 * 100);
    }
}
