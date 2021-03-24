package pr04Person;

public class Main {
    public static void main(String[] args) {

        Person person = null;
        try {
            person = new Person("null", null, 10);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
