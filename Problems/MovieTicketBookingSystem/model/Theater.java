package Problems.MovieTicketBookingSystem.model;

import java.util.HashMap;

public class Theater {
    private int theaterId;
    private String theaterName;
    private String address;
    private int cityId;
    private HashMap<Integer, Screen> screensMap;

    public Theater(int theaterId, String theaterName, int cityId) {
        this.theaterId = theaterId;
        this.theaterName = theaterName;
        this.cityId = cityId;
        this.screensMap = new HashMap<>();
    }

    public void addScreen(Screen screen) {
        screensMap.put(screen.getScreenId(), screen);
    }

    public int getTheaterId() {
        return theaterId;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public String getAddress() {
        return address;
    }

    public int getCityId() {
        return cityId;
    }

    public HashMap<Integer, Screen> getScreensMap() {
        return screensMap;
    }
}
