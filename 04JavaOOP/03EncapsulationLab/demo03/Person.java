package demo03;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.setAge(age);
        this.setName(name);
    }

    void setAge(int age) {
        if (age<=0) {
            throw new IllegalArgumentException("NotValidAge");
        }
        this.age = age;
    }

    private void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("NotValicName");
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
