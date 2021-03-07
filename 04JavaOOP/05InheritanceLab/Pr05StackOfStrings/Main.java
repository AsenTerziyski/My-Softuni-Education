package Pr05StackOfStrings;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StackOfStrings sos = new StackOfStrings();

        sos.push("Cat");
        sos.push("Dog");
        sos.push("Bird");
        sos.push("Dolphin");
        System.out.println(sos.isEmpty());
        System.out.println();
        System.out.println(sos.peek());
        System.out.println(sos.pop());
        System.out.println(sos.pop());
        System.out.println(sos.pop());
        System.out.println(sos.pop());
        System.out.println(sos.pop());
        System.out.println(sos.isEmpty());
    }
}
