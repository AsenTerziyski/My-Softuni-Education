package demo06SayHelloToBulgarian;

public class Bulgarian implements Person {
    private String name;
    private int age;

    public Bulgarian(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    private void setAge(int age) {
        if (BulgarianValidator.validateAge(age)) {
            this.age = age;
        }
    }

    private void setName(String name) {
        if (BulgarianValidator.validateName(name)) {
            this.name = name;
        }
    }

    @Override
    public String getPersonName() {
        return this.name;
    }

    @Override
    public void sayHello() {
        System.out.println(this.name + ", здрасти :)");
    }

    @Override
    public String toString() {
        return String.format("This person is %s with name %s and is %d years old.",
                this.getClass().getSimpleName(),
                this.getPersonName(), this.age);
    }
}
