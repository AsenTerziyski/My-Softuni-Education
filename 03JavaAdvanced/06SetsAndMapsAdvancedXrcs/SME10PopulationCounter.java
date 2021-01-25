import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SME10PopulationCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Map<String, Long>> populationInfo = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!"report".equalsIgnoreCase(input)) {

            String[] tokens = input.split("\\|");
            String city = tokens[0];
            String country = tokens[1];
            long population = Long.parseLong(tokens[2]);

            populationInfo.putIfAbsent(country, new LinkedHashMap<>());
            populationInfo.get(country).putIfAbsent(city, 0L);
            populationInfo.get(country).put(city, populationInfo.get(country).get(city) + population);

            input = scanner.nextLine();
        }

        // print and sort
        populationInfo
                .entrySet()
                .stream()
                .sorted((c1, c2) -> {

                    long p1 = c1.getValue()
                            .values()
                            .stream()
                            .mapToLong(el -> el)
                            .sum();

                    long p2 = c2.getValue()
                            .values()
                            .stream()
                            .mapToLong(el -> el)
                            .sum();

                    return Long.compare(p2, p1);

                })
                .forEach(country -> {
                    long totalPopulation = country.getValue().values().stream().mapToLong(c -> c).sum();
                    System.out.println(String.format("%s (total population: %d)", country.getKey(), totalPopulation));

                    Map<String, Long> cityInfo = country.getValue();
                    cityInfo
                            .entrySet()
                            .stream()
                            .sorted((c1, c2) -> Long.compare(c2.getValue(), c1.getValue()))
                            .forEach(city -> System.out.println(String.format("=>%s: %d", city.getKey(), city.getValue())));

                });
    }
}
