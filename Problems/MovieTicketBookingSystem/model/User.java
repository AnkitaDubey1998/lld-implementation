package Problems.MovieTicketBookingSystem.model;

public class User {
    private int userId;
    private String name;
    private String phoneNumber;
    private String emailId;

    public User(int userId, String name, String phoneNumber, String emailId) {
        this.userId = userId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }
}
