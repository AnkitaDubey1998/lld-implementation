package Mock.ParcelHubSystem.model;

import java.util.ArrayList;
import java.util.List;

public class Hub {
    private int hubId;
    private String address;
    private int capacity;
    private List<Parcel> parcelList;

    public Hub(int hubId, String address, int capacity) {
        this.hubId = hubId;
        this.address = address;
        this.capacity = capacity;
        this.parcelList = new ArrayList<>();
    }

    public void addParcel(Parcel parcel) {
        parcelList.add(parcel);
    }



    // getters and setters
}
