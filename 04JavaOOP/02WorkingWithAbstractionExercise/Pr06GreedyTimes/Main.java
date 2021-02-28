
package Pr06GreedyTimes;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long bagCapacity = Long.parseLong(scanner.nextLine());
        String[] input = scanner.nextLine().split("\\s+");

//        var torba = new LinkedHashMap<String, LinkedHashMap<String, Long>>();
        Bag bag = new Bag(bagCapacity);

        for (int i = 0; i < input.length; i += 2) {
            String item = input[i];
            long quantity = Long.parseLong(input[i + 1]);
            if (item.length() == 3) {
                bag.addCash(item, quantity);
            } else if (item.toLowerCase().endsWith("gem")) {
                if (item.length()>=4) {
                    bag.addGems(item, quantity);
                }
            } else if (item.toLowerCase().equals("gold")) {
                bag.addGold(quantity);
            }
        }
        bag.printContent();

    }
}