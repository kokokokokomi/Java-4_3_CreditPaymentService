public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int creditBody = 1000000;
        int creditTerm = 12;
        double percentYear = 9.99;


        double CreditPaymentServiceOneYear = service.calculate(1000000, 12, 9.99);
        System.out.println(CreditPaymentServiceOneYear);

        double CreditPaymentServiceTwoYears = service.calculate(1000000, 24, 9.99);
        System.out.println(CreditPaymentServiceTwoYears);

        double CreditPaymentServiceThreeYears = service.calculate(1000000, 36, 9.99);
        System.out.println(CreditPaymentServiceThreeYears);


    }
}