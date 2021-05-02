package demo01LystyOperator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListOperator listOperator = new ListOperator("A", "B", "C");
        boolean b = listOperator.hasNext();
        System.out.println(b);
        boolean move = listOperator.move();
        System.out.println(move);
        listOperator.print();
    }
}
