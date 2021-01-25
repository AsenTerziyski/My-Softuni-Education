import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SME08HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Set<String>> playersCards = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equalsIgnoreCase("joker")) {
            String[] tokens = input.split(":");
            String name = tokens[0];
            String[] cards = tokens[1].split(",\\s+");
            // има излишен спейс преди първата карта. Трябва да се премахне.
            if (!playersCards.containsKey(name)) {
                playersCards.put(name, new HashSet<>());
            }

            for (int i = 0; i < cards.length; i++) {
                // с "трим" се премахва излишния спейс:
                playersCards.get(name).add(cards[i].trim());
            }
//            for (String card : cards) {
//                playersCards.get(name).add(card.trim());
//            }
            input = scanner.nextLine();
        }

        // (?<power>[0-9]+|[JQKA])(?<types>[CHDS]{1})
        String regex = "(?<power>[0-9]+|[JQKA])(?<types>[CHDS]{1})";
        Pattern pattern = Pattern.compile(regex);

        for (Map.Entry<String, Set<String>> entry : playersCards.entrySet()) {

            String name = entry.getKey();
            int playerScore = 0;

            for (String cards : entry.getValue()) {
                Matcher matcher = pattern.matcher(cards);

                if (matcher.find()) {
                    String power = matcher.group("power");
                    String type = matcher.group("types");
                    int value = getValueByPower(power);
                    int multiplier = getMultiplierByType(type);
                    int score = value * multiplier;
                    playerScore += score;
                }

            }

            System.out.println(String.format("%s: %d", name, playerScore));
        }
    }

    private static int getMultiplierByType(String type) {
        int multiplier = 0;

        switch (type) {
            case "S":
                multiplier = 4;
                break;
            case "H":
                multiplier = 3;
                break;
            case "D":
                multiplier = 2;
                break;
            case "C":
                multiplier = 1;
                break;
        }

        return multiplier;
    }

    private static int getValueByPower(String power) {
        int value = 0;

        switch (power) {
            case "J":
                value = 11;
                break;
            case "Q":
                value = 12;
                break;
            case "K":
                value = 13;
                break;
            case "A":
                value = 14;
                break;
            default:
                value = Integer.parseInt(power);
                break;
        }

        return value;

    }
}
