public class CreditPaymentService {
    public int calculate (int loan_amount, double bet, int years) {
        int months = years * 12;
        double bet_months = bet/1200;
        double expression = Math.pow((1 + bet_months), months);
        return (int) (loan_amount * bet_months * expression / (expression - 1));
    }
}
