package demo03BirthdayCelebrations;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Citizen citizen = new Citizen("A", 30, "id10", "05.05.2000");
        Pet pet = new Pet("B", "10.10.2010");
        Robot robot = new Robot("idR10", "model10");

        Method[] declaredMethods = citizen.getClass().getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }

        String simpleName = citizen.getClass().getSimpleName();
        System.out.println(simpleName);
        System.out.println(citizen.getBirthDate());
        System.out.println(citizen.getName());
        System.out.println(citizen.getId());
    }


}
