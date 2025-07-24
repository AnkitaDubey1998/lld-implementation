package Problems.MovieTicketBookingSystem.service;

import Problems.MovieTicketBookingSystem.enums.PaymentMode;
import Problems.MovieTicketBookingSystem.model.Booking;
import Problems.MovieTicketBookingSystem.model.User;
import Problems.MovieTicketBookingSystem.paymentStrategy.PaymentFactory;
import Problems.MovieTicketBookingSystem.paymentStrategy.PaymentStrategy;

public class PaymentService {

    private PaymentFactory paymentFactory;
    private PaymentStrategy paymentStrategy;

    public PaymentService(PaymentFactory paymentFactory) {
        this.paymentFactory = paymentFactory;
    }

    public boolean processPayment(User user, String bookingId, double amount, PaymentMode paymentMode) {
        setPaymentStrategy(paymentFactory.getPaymentStrategy(paymentMode));
        paymentStrategy.processPayment(user, amount);
        // persist payment details for bookingId in database
        return true;
    }

    private void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}
