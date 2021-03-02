package Pr03ValidationData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        //int n = Integer.parseInt(reader.readLine());
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            //String[] input = reader.readLine().split(" ");
            String[] input = scanner.nextLine().split("\\s+");
            people.add(new Person(input[0], input[1], Integer.parseInt(input[2]), Double.parseDouble(input[3])));
        }

        //double bonus = Double.parseDouble(reader.readLine());
        double bonus = Double.parseDouble(scanner.nextLine());
        for (Person person : people) {
            person.increaseSalary(bonus);
            System.out.println(person.toString());
        }

    }

}
