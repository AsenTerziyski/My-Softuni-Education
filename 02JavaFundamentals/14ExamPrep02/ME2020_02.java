import java.util.Scanner;

public class ME2020_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialHealth = 100;
        int hp = 0;
        int initialBitCoins = 0;
        int sumBitCoins = 0;
        boolean isKilled = false;
        int roomCount = 0;
        //трябва да искейпна бара:
        String[] inputArray = scanner.nextLine().split("\\|");
        for (int i = 0; i < inputArray.length; i++) {
            String[] commandArray = inputArray[i].split(" ");
            String command = commandArray[0];
            int number = Integer.parseInt(commandArray[1]);
            roomCount++;
            switch (command) {
                case "potion":
                    hp = number;
                    if (initialHealth + number >= 100) {
                        hp = 100 - initialHealth;
                        initialHealth = 100;
                    } else {
                        initialHealth = initialHealth + hp;
                    }
                    System.out.printf("You healed for %d hp.%n", hp);
                    System.out.printf("Current health: %d hp.%n", initialHealth);
                    break;
                case "chest":
                    initialBitCoins = number;
                    System.out.printf("You found %d bitcoins.%n", initialBitCoins);
                    sumBitCoins = sumBitCoins + initialBitCoins;
                    break;
                default:
                    int monsterAttack = number;
                    String monster = command;
                    initialHealth = initialHealth - monsterAttack;
                    if (initialHealth > 0) {
                        System.out.printf("You slayed %s.%n", monster);
                    } else {
                        System.out.printf("You died! Killed by %s.%n", monster);
                        System.out.printf("Best room: %d%n", roomCount);
                        isKilled = true;
                        return;
                    }
                    break;
            }
            //roomCount++;

        }
        if (!isKilled) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", sumBitCoins);
            System.out.printf("Health: %d%n", initialHealth);
        }
    }
}
