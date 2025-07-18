package Problems.MovieTicketBookingSystem.model;

public class Movie {
    private int movieId;
    private String movieName;
    private int movieDurationInMinutes;

    public Movie(int movieId, String movieName, int movieDurationInMinutes) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieDurationInMinutes = movieDurationInMinutes;
    }

    public int getMovieId() {
        return movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getMovieDurationInMinutes() {
        return movieDurationInMinutes;
    }
}
