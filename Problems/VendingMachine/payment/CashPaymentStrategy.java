package Problems.VendingMachine.payment;

public class CashPaymentStrategy implements PaymentStrategy{
    @Override
    public void processPayment() {
        // simulate payment
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("CASH payment processed");
    }
}
