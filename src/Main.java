public class Main {
    public static void  main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amount = 1_000_000;
        double percent = 0.0999;
        int term;
        int platezh12 = service.calculate(amount, percent, term = 12);
        System.out.println(platezh12);
        int platezh24 = service.calculate(amount, percent, term = 24);
        System.out.println(platezh24);
        int platezh36 = service.calculate(amount, percent, term = 36);
        System.out.println(platezh36);
    }
}
