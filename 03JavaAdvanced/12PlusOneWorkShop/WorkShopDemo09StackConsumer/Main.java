package WorkShopDemo09StackConsumer;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        SmartStack stack = new SmartStack();
        System.out.println(stack.isEmpty());

        stack.push(13);
        stack.push(42);
        stack.push(69);

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println(stack.peek());

        System.out.println(stack.isEmpty());

        System.out.println(stack.size());

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxx");
//        while (!stack.isEmpty()) {
//            System.out.println(stack.pop());
//        }
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        //stack.forEach(s-> System.out.println(s));
        stack.forEach(System.out::println);

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        System.out.println(stack.isEmpty());

    }
}
