package Mock.ParcelHubSystem.notificationStrategy;

import Mock.ParcelHubSystem.model.Parcel;

public interface NotificationStrategy {
    void sendNotification(Parcel parcel);
}
