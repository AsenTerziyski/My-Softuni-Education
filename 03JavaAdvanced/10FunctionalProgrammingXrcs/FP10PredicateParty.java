import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP10PredicateParty {
    static List<String> names = null;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        names = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String inputLine = scanner.nextLine();
        while (!"party!".equalsIgnoreCase(inputLine)) {
            String[] tokens = inputLine.split("\\s+");
            String currentCommand = tokens[0];

            switch (currentCommand) {
                case "Double":
                    addOneMore(getPredicate(tokens));
                    break;
                case "Remove":
                    removeName(getPredicate(tokens));

                    break;
            }

            inputLine = scanner.nextLine();
        }


        if (names.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
//            names = names
//                    .stream()
//                    .sorted((f, s)-> f.compareTo(s))
//                    .collect(Collectors.toList());
//            String output = "";
//            for (String name : names) {
//                output = output + name + ", ";
//            }
//            System.out.println(output.substring(0, output.length()-2) + " are going to the party!");
            Collections.sort(names);
            System.out.println(names.toString().replaceAll("([\\[\\]])", "") + " are going to the party!");
        }
    }

    private static void removeName(Predicate<String> predicate) {
        names.removeIf(predicate);
    }

    private static void addOneMore(Predicate<String> predicate) {
        List<String> namesToAdd = new ArrayList<>();
        names.stream().filter(predicate).forEach(n-> namesToAdd.add(n));
        names.addAll(namesToAdd);

    }

    private static Predicate<String> getPredicate(String[] tokens) {
        Predicate<String> predicate = null;
        switch (tokens[1]) {
            case "StartsWith":
                predicate = name-> name.startsWith(tokens[2]);
                break;
            case "EndsWith":
                predicate = name-> name.endsWith(tokens[2]);
                break;
            //case "Length":
            default:
                predicate = name-> name.length() == Integer.parseInt(tokens[2]);
                break;
        }
        return predicate;
        //return null;
    }
}
