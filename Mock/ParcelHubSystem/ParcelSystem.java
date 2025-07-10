package Mock.ParcelHubSystem;

import Mock.ParcelHubSystem.model.Hub;
import Mock.ParcelHubSystem.model.Parcel;
import Mock.ParcelHubSystem.model.User;
import Mock.ParcelHubSystem.notificationStrategy.EmailNotificationStrategy;
import Mock.ParcelHubSystem.notificationStrategy.NotificationStrategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ParcelSystem {
    public static ParcelSystem instance;
    List<User> userList;
    List<Hub> hubList;
    HashMap<Integer, Parcel> parcels;
    NotificationStrategy notificationStrategy;

    private ParcelSystem() {
        this.userList = new ArrayList<>();
        this.hubList = new ArrayList<>();
        this.parcels = new HashMap<>();
        this.notificationStrategy = new EmailNotificationStrategy();
    }

    public synchronized static ParcelSystem getInstance() {
        if(instance == null) {
            instance = new ParcelSystem();
        }
        return instance;
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public void addHub(Hub hub) {
        hubList.add(hub);
    }

    public void notifyUser(Parcel parcel) {
        parcels.put(parcel.getParcelId(), parcel);
        notificationStrategy.sendNotification(parcel);
    }

    public void collectParcel(User user, Number userOtp, int parcelId) {
        if(userOtp.equals(parcels.get(parcelId).getOtp())) {
            Parcel parcel = parcels.get(parcelId);
            parcel.setParcelStatus(ParcelStatus.COLLECTED);
            parcels.put(parcelId, parcel);
            notificationStrategy.sendNotification(parcel);
        }

    }


}
