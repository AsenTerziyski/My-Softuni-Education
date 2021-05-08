package demo01DefineAnInterfacePerson;

import Pr01DefineAnInterfacePerson.Citizen;
import Pr01DefineAnInterfacePerson.Person;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonD personD1 = new CitizenD("A", 10);
        PersonD personD2 = new CitizenD("B", 20);
        PersonD personD3 = new CitizenD("C", 30);
        PersonD personD4 = new CitizenD("D", 40);

        PersonsList personsList = new PersonsList();
        personsList.addPerson(personD1);
        personsList.addPerson(personD2);
        personsList.addPerson(personD3);
        System.out.println(personsList.removePerson(personD3));
        Class[] interfaces = CitizenD.class.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println(anInterface);
        }
//        System.out.println(personsList.removePerson(personD4));
        Method[] declaredMethods = PersonD.class.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
    }
}
