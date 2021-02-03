package dc01OpinionPoll;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Person> personMap = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String currentName = input[0];
            int currentAge = Integer.parseInt(input[1]);
            Person person = new Person();
            person.setName(currentName);
            person.setAge(currentAge);
            personMap.putIfAbsent(currentName, new Person());
            personMap.put(currentName, person);
        }

        personMap
                .entrySet()
                .stream()
                .filter(obj -> obj.getValue().getAge() > 30)
                .forEach(s -> System.out.println(s.getValue()));
    }
}
