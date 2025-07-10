package Mock.ParcelHubSystem.model;

import Mock.ParcelHubSystem.ParcelStatus;

import java.util.Date;

public class Parcel {
    private int parcelId;
    private Number otp;
    private Date incomingDate;
    private int validity = 7;
    private Date validTillDate;
    private ParcelStatus parcelStatus;
    private User user;

    // getters setters

    private void calculateValidity() {
        // calculate validTill date and set it
    }


    public int getParcelId() {
        return parcelId;
    }

    public Number getOtp() {
        return otp;
    }

    public int getValidity() {
        return validity;
    }

    public ParcelStatus getParcelStatus() {
        return parcelStatus;
    }

    public User getUser() {
        return user;
    }

    public void setParcelId(int parcelId) {
        this.parcelId = parcelId;
    }

    public void setOtp(Number otp) {
        this.otp = otp;
    }

    public void setValidity(int validity) {
        this.validity = validity;
    }

    public void setParcelStatus(ParcelStatus parcelStatus) {
        this.parcelStatus = parcelStatus;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
