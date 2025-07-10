package Mock.ParcelHubSystem;

import Mock.ParcelHubSystem.model.Customer;
import Mock.ParcelHubSystem.model.Hub;
import Mock.ParcelHubSystem.model.Parcel;
import Mock.ParcelHubSystem.model.User;

public class Main {
    public static void main(String[] args) {
        ParcelSystem parcelSystem = ParcelSystem.getInstance();

        // initialize

        User user = new Customer();
        parcelSystem.addUser(user);

        Hub hub1 = new Hub(1, "", 10);
        parcelSystem.addHub(hub1);

        Parcel parcel1 = new Parcel();
        hub1.addParcel(parcel1);
        parcelSystem.notifyUser(parcel1);


        // request


    }
}
