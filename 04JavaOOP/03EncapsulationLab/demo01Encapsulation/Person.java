package demo01Encapsulation;

public class Person {
    private int age;
    private int height;

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Negative or zero age not allowed");
        }
    }

    public void setHeight(int height) {
        if (height>0) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Negative or zero height not allowed");
        }
    }
}
