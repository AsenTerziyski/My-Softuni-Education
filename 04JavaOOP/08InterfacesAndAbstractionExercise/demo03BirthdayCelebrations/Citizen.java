package demo03BirthdayCelebrations;

public class Citizen implements Identifiable, Birthable, Creature {
    private String name;
    private int age;
    private String id;
    private String birthDate;

    public Citizen(String name, int age, String id, String birthDate) {
        this.setName(name);
        this.setAge(age);
        this.setId(id);
        this.setBirthDate(birthDate);
    }

    private void setBirthDate(String birthDate) {
        Validator.validateBirthDate(birthDate);
        this.birthDate = birthDate;
    }

    private void setId(String id) {
        Validator.validateId(id);
        this.id = id;
    }

    private void setAge(int age) {
        Validator.validateAge(age);
        this.age = age;
    }

    private void setName(String name) {
        Validator.validateName(name);
        this.name = name;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
