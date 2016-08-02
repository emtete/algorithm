/**
 * Created by victor on 2016. 6. 8..
 */
public class InterestRate {
    boolean flag = false;
    boolean minus = false;
    boolean plus = false;
    double remainder = 0;

    public double interestRate(double price, double monthlyPayment, int loanTerm){

        double prePer = ( ( ( monthlyPayment * loanTerm ) - price ) / loanTerm ) / price;
        remainder = prePer;


        return halfSearch(loanTerm, monthlyPayment, price, prePer);
    }

    public double calculate(int loanTerm, double monthlyPayment, double price, double prePer){
        if( loanTerm == 0 ) return price;

            price = price + price * prePer - monthlyPayment;
        return calculate(loanTerm-1, monthlyPayment, price, prePer );

    }

    public double halfSearch(int loanTerm, double monthlyPayment, double price, double prePer){
        double result = calculate(loanTerm, monthlyPayment, price, prePer);
        if(plus && minus) flag = true;
        if( -00000.1 < result && result < 0.00001 ){
            return prePer;
        }else if( result > 0 ){
            plus = true;
            if(flag){
                remainder /= 2;
                prePer = prePer - remainder;
            }else{
                prePer = prePer - remainder;
            }
            return halfSearch(loanTerm, monthlyPayment, price, prePer);
        }else if( result < 0){
            minus = true;
            if(flag){
                remainder /= 2;
                prePer = prePer + remainder;
            }else{
                prePer = prePer + remainder;
            }
            return halfSearch(loanTerm, monthlyPayment, price, prePer);
        }else{
            return prePer;
        }
    }


}
