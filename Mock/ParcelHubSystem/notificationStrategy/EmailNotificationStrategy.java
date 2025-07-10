package Mock.ParcelHubSystem.notificationStrategy;

import Mock.ParcelHubSystem.model.Notification;
import Mock.ParcelHubSystem.model.Parcel;

public class EmailNotificationStrategy implements NotificationStrategy {
    @Override
    public void sendNotification(Parcel parcel) {
        Notification notification = new Notification();
        // send email to user.getEmail();
    }
}
