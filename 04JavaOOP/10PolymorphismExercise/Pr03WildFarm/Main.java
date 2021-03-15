package Pr03WildFarm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Animal> animals = new ArrayList<>();

        String input = scanner.nextLine();
        while (!"End".equals(input)) {
            String[] animalInfo = input.split("\\s+");
            String type = animalInfo[0];
            String name = animalInfo[1];
            double weight = Double.parseDouble(animalInfo[2]);
            String livingRegion = animalInfo[3];
            String breed = "";
            if (animalInfo.length == 5) {
                breed = animalInfo[4];
            }
            Animal animal = null;
            switch (type) {
                case "Mouse":
                    animal = new Mouse(type, name, weight, livingRegion);
                    break;
                case "Zebra":
                    animal = new Zebra(type, name, weight, livingRegion);
                    break;
                case "Cat":
                    animal = new Cat(type, name, weight, livingRegion, breed);
                    break;
                case "Tiger":
                    animal = new Tiger(type, name, weight, livingRegion);
                    break;
            }
            animal.makeSound();

            String[] foodTokens = scanner.nextLine().split("\\s+");
            String foodType = foodTokens[0];
            int foodTypeQuantity = Integer.parseInt(foodTokens[1]);

            Food food = null;
            switch (foodType) {
                case "Vegetable":
                    food = new Vegetable(foodTypeQuantity);
                    break;
                case "Meat":
                    food = new Meat(foodTypeQuantity);
                    break;
            }

            try {
                animal.eat(food);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            animals.add(animal);
            input = scanner.nextLine();
        }

        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }

    }
}
