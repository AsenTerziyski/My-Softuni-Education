package Pr03CardsWithPower;

public class Card {
    private CardRank rank;
    private CardSuite suite;
    private int power;

    public Card(CardRank rank, CardSuite suite) {
        this.rank = rank;
        this.suite = suite;
        calculatePower();
    }

    private void calculatePower() {
        this.power = this.rank.getValue() + this.suite.getValue();
    }

    @Override
    public String toString() {
        //Card name: TWO of CLUBS; Card power: 2
        return String.format("Card name: %s of %s; Card power: %d", this.rank, this.suite.name(), this.power);
    }
}
