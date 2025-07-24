package Problems.MovieTicketBookingSystem.paymentStrategy;

import Problems.MovieTicketBookingSystem.model.User;

public interface PaymentStrategy {
    boolean processPayment(User user, double amount);
}
