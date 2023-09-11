public class CreditPaymentService {

        public int calculate (int amount, double percent, int term) {
            int result;
            result = (int) (amount * (percent/12) * Math.pow( 1 + percent/12, term) / (Math.pow(1 + (percent/12),  term)-1));
            return result;





    }
}
