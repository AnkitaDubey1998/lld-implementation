package Problems.MovieTicketBookingSystem.paymentStrategy;

import Problems.MovieTicketBookingSystem.model.User;

import java.util.UUID;

public class DebitCardPaymentStrategy implements PaymentStrategy {
    @Override
    public boolean processPayment(User user, double amount) {
        System.out.println("User " + user.getName() + " made payment of " + amount + " by Debit Card Mode");
        return true;
    }
}
