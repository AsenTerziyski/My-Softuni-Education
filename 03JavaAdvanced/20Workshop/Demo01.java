public class Demo01 {
    public static void main(String[] args) {
        System.out.println(hello());
    }

    private static String hello() {
        return "Hello" + name();
    }

    private static String name() {
        return hello();
    }
}
