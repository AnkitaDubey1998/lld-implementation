package Problems.VendingMachine.payment;

public class UPIPaymentStrategy implements PaymentStrategy{
    @Override
    public void processPayment() {
        // simulate payment
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("UPI payment processed");
    }
}
