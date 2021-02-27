package Pr03CardsWithPower;

public enum CardSuite {
    CLUBS(0), DIAMONDS(13), HEARTS(26), SPADES(39);
    private int value;
    //CLUBS - 0, DIAMONDS - 13, HEARTS - 26, SPADES - 39

    CardSuite(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
