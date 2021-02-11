package GenericsPrblm03Scale;

public class Main {

    public static void main(String[] args) {
//        Scale<String> stringScale = new Scale<>("A", "B");
//        System.out.println(stringScale.getHeavier());
        Scale<Integer> integerScale = new Scale<>(1, 2);
        System.out.println(integerScale.getHeavier());

    }
}
