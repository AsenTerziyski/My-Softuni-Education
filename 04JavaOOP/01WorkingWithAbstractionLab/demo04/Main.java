package demo04;

public class Main {
    static {
        System.out.println(1 + ". FromStaticBlock");
    }

    static {
        System.out.println(4 + ". FromStaticBlock");
    }

    public static void main(String[] args) {
        System.out.println(2 + ". FromMain");

    }

    static {
        System.out.println(3 + ". FromStaticBlock");
    }
}
