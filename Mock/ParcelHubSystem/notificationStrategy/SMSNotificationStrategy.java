package Mock.ParcelHubSystem.notificationStrategy;

import Mock.ParcelHubSystem.model.Parcel;

public class SMSNotificationStrategy implements NotificationStrategy {
    @Override
    public void sendNotification(Parcel parcel) {
        // send SMS to user.getPhoneNumber()
    }
}
