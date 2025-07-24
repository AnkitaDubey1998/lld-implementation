package Problems.MovieTicketBookingSystem.paymentStrategy;

import Problems.MovieTicketBookingSystem.enums.PaymentMode;

public class PaymentFactory {
    public PaymentStrategy getPaymentStrategy(PaymentMode paymentMode) {
        return switch (paymentMode) {
            case UPI -> new UPIPaymentStrategy();
            case DEBIT_CARD -> new DebitCardPaymentStrategy();
            default -> null;
        };
    }
}
