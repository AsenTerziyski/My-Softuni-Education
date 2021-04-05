package demo01;

public enum Day {

    Mon(1),Tue(2),Wed(3),Thu(4),Fri(5),Sat(6),Sun(7);

    private int value;

    Day(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
