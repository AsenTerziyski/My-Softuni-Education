package Pr01MathOperation;

public class MathOperation {

//    public static int add(int f, int s) {
//        return f + s;
//    }
//
//    public static int add(int f, int s, int t) {
//        return add(add(f, s), t);
//    }
//
//    public static int add(int f, int s, int t, int d) {
//        return add(add(f, s, t), d);
//    }

    public int add(int f, int s) {
        return f + s;
    }

    public int add(int f, int s, int t) {
        return add(add(f, s), t);
    }

    public int add(int f, int s, int t, int d) {
        return add(add(f, s, t), d);
    }

}
