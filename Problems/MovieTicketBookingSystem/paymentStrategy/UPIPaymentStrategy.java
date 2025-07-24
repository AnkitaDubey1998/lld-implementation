package Problems.MovieTicketBookingSystem.paymentStrategy;

import Problems.MovieTicketBookingSystem.model.User;

import java.util.UUID;

public class UPIPaymentStrategy implements PaymentStrategy {
    @Override
    public boolean processPayment(User user, double amount) {
        System.out.println("User " + user.getName() + " made payment of " + amount + " by UPI Mode");
        return true;
    }
}
