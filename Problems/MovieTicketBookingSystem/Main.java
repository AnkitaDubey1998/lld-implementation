package Problems.MovieTicketBookingSystem;

import Problems.MovieTicketBookingSystem.model.Movie;
import Problems.MovieTicketBookingSystem.model.Show;
import Problems.MovieTicketBookingSystem.model.Theater;
import Problems.MovieTicketBookingSystem.model.User;
import Problems.MovieTicketBookingSystem.utility.Util;

public class Main {
    public static void main(String[] args) {
        // https://dev-shivansh95.medium.com/low-level-design-for-bookmyshow-8db8465e560a

        MovieTicketBookingSystem movieTicketBookingSystem = MovieTicketBookingSystem.getInstance();

        User user1 = new User(1, "Ankita", "11111", "ankita@gmail.com");
        User user2 = new User(2, "Archana", "22222", "archana@gmail.com");
        movieTicketBookingSystem.addUser(user1);
        movieTicketBookingSystem.addUser(user2);

        initializeSystem(movieTicketBookingSystem);

    }

    private static void initializeSystem(MovieTicketBookingSystem movieTicketBookingSystem) {
        Theater theater1 = Util.createTheater(1, "PVR Mumbai", 401);
        Theater theater2 = Util.createTheater(2, "INOX Bangalore", 501);
        movieTicketBookingSystem.addTheater(theater1);
        movieTicketBookingSystem.addTheater(theater2);

        Movie movie1 = new Movie(301, "Avengers", 180);
        Movie movie2 = new Movie(302, "Justice League", 150);

        Show show1 = Util.createShow(1001, movie1, theater1.getScreensMap().get(1));
        Show show2 = Util.createShow(1002, movie1, theater1.getScreensMap().get(2));
        Show show3 = Util.createShow(1003, movie2, theater1.getScreensMap().get(1));
        Show show4 = Util.createShow(1004, movie2, theater1.getScreensMap().get(2));
        Show show5 = Util.createShow(1005, movie1, theater2.getScreensMap().get(2));
        Show show6 = Util.createShow(1006, movie2, theater2.getScreensMap().get(1));
        movieTicketBookingSystem.addShow(show1);
        movieTicketBookingSystem.addShow(show2);
        movieTicketBookingSystem.addShow(show3);
        movieTicketBookingSystem.addShow(show4);
        movieTicketBookingSystem.addShow(show5);
        movieTicketBookingSystem.addShow(show6);
    }
}
