package Pr04HotelReservation;

public enum DiscountType {

    VIP(20),
    SECONDVISIT(10),
    NONE(0);

    private int percentage;

    DiscountType (int percentage) {
        this.percentage = percentage;
    }

    public int getPercentage() {
        return percentage;
    }
}
