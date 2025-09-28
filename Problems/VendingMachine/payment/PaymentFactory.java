package Problems.VendingMachine.payment;

import Problems.VendingMachine.enums.PaymentMode;

public class PaymentFactory {

    public static PaymentStrategy getPaymentStrategy(PaymentMode paymentMode) {
        return switch (paymentMode) {
            case CASH -> new CashPaymentStrategy();
            case UPI -> new UPIPaymentStrategy();
            default -> null;
        };
    }

}
