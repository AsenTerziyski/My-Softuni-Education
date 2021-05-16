import java.util.Scanner;

public class x04Tribunachi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        printTribunachiSeq(n);

//        int a = 0;
//        int b = 0;
//        int c = 1;
//        int d = a + b + c;
//        System.out.print(d + " ");
//
//        for (int i = 1; i < n; i++) {
//            if (d >= 1) {
//                System.out.print(d + " ");
//            }
//            a = b;
//            b = c;
//            c = d;
//            d = a + b + c;
//        }
//        System.out.println();
    }

    private static void printTribunachiSeq(int n) {
        int a = 0;
        int b = 0;
        int c = 1;
        int d = a + b + c;
        System.out.print(d + " ");
        for (int i = 1; i < n; i++) {
            if (d >= 1) {
                System.out.print(d + " ");
            }
            a = b;
            b = c;
            c = d;
            d = a + b + c;
        }
        System.out.println();
        //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
    }
}

