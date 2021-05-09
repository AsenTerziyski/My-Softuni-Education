package demo03BirthdayCelebrations;

public class Pet implements Birthable, Creature {
    private String name;
    private String birthDate;

    public Pet(String name, String birthDate) {
        this.setName(name);
        this.setBirthDate(birthDate);
    }

    private void setBirthDate(String birthDate) {
        Validator.validateBirthDate(birthDate);
        this.birthDate = birthDate;
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
    public String getName() {
        return name;
    }
}
