package Pr04HotelReservation;

public class PriceCalculator {
    private double pricePerDay;
    private int numberOfDays;
    private Season season;
    private DiscountType discountType;


    public PriceCalculator(double pricePerDay, int days,Season season, DiscountType discountType) {
        this.pricePerDay = pricePerDay;
        this.numberOfDays = days;
        this.discountType = discountType;
        this.season = season;
    }

    public double calculate() {
        double v = pricePerDay * numberOfDays * season.getMultiplier() * (1.00 - 1.00*discountType.getPercentage() / 100);
        return v;
    }
}
