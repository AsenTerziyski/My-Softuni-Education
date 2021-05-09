package Pr04FoodShortage;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Buyer buyer1 = new Citizen("A", 10, "ID1", "10.10.2010");
        System.out.println(buyer1.getFood());
        buyer1.buyFood();
        System.out.println(buyer1.getFood());
        buyer1.buyFood();
        buyer1.buyFood();
        buyer1.buyFood();
        System.out.println(buyer1.getFood());

        int n = Integer.parseInt(scanner.nextLine());
        List<Buyer> buyerList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            String idOrGroup = tokens[2];
            Buyer buyer = null;
            if (tokens.length == 4) {
                String birthDay = tokens[3];
                buyer = new Citizen(name, age, idOrGroup, birthDay);
            } else if (tokens.length == 3) {
                buyer = new Rebel(name, age, idOrGroup);
            } else {
                throw new IllegalArgumentException(ExceptionMessages.VALIDATE_PARAMETER_COUNT);
            }
            buyerList.add(buyer);

        }

        String name = scanner.nextLine();
        while (!"End".equals(name)) {
            for (Buyer buyer : buyerList) {
                if (name.equals(buyer.getName())) {
                    buyer.buyFood();
                    break;
                }
            }
            name = scanner.nextLine();
        }

        int sum = 0;
        for (int i = 0; i <buyerList.size(); i++) {
            int currentFood = buyerList.get(i).getFood();
            sum += currentFood;
        }
        System.out.println(sum);

    }
}
