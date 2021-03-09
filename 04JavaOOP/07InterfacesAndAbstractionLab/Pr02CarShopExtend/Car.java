package Pr02CarShopExtend;

public interface Car {
    //public static final Integer TIRES = 4;
    // може и така да се напише"
    Integer TIRES = 4;
    public abstract String getModel();
    //може без public abstract, защото са подразбират.
    String getColor();
    Integer getHorsePower();
    String countryProduced();
}
