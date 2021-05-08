package demo01DefineAnInterfacePerson;

import Pr01DefineAnInterfacePerson.Citizen;

public class CitizenD implements PersonD {
    private String name;
    private int age;

    public CitizenD(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    private void setAge(int age) {
        if (CitizenValidation.ageValidate(age)) {
            this.age = age;
        }
    }

    private void setName(String name) {
        if (CitizenValidation.nameValidate(name)) {
            this.name = name;
        }
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return this.getName() + "=>" + this.getAge();
    }
}
