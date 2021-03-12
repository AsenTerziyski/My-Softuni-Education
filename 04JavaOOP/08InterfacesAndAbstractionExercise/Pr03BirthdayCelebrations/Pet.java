package Pr03BirthdayCelebrations;

public class Pet implements Birthable, Creature {
    private String name;
    private String birthDate;

    public Pet(String name, String birthDate) {
        this.setName(name);
        this.setBirthDay(birthDate);
    }

    private void setBirthDay(String birthDate) {
        this.birthDate = birthDate;
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }
}
