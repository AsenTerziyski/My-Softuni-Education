package demo01Encapsulation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        int age1 = 10;
        int height1 = 150;
        person.setAge(age1);
        person.setHeight(height1);

        int age2 = -10;
        int height3 = -150;
        Person person2 = new Person();
        person2.setAge(age2);
        person2.setHeight(height3);

	// write your code here
    }
}
