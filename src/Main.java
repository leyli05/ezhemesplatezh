public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amount = 1_000_000;
        double percent = 0.0999;
        int term;
        int payment12 = service.calculate(amount, percent, term = 12);
        System.out.println(payment12);
        int payment24 = service.calculate(amount, percent, term = 24);
        System.out.println(payment24);
        int payment36 = service.calculate(amount, percent, term = 36);
        System.out.println(payment36);
    }
}
