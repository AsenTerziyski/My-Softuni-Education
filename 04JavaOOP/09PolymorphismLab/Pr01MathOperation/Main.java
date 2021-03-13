package Pr01MathOperation;

public class Main {

    public static void main(String[] args) {
        MathOperation math = new MathOperation();
//        System.out.println(MathOperation.add(1,2));
//        System.out.println(MathOperation.add(1,2,3));
//        System.out.println(MathOperation.add(1,2,3,4));
        System.out.println(math.add(2, 2));
        System.out.println(math.add(3, 3, 3));
        System.out.println(math.add(4, 4, 4, 4));
    }
}
