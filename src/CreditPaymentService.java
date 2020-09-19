public class CreditPaymentService {
    public double calculate(int creditBody, int creditTerm, double percentYear) {
        double percentMonth = percentYear / 12 / 100;
        double generalRate = 1 + percentMonth;
        double generalRateYear = Math.pow(generalRate, 12);
        double creditPayment = creditBody * percentMonth * generalRateYear / (generalRateYear - 1);

        return creditPayment;
        }
}
