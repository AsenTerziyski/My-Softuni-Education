import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SM07CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>> continentCountryCity = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String[] currentInput = scanner.nextLine().split("\\s+");
            String currentContinent = currentInput[0];
            String currentCountry = currentInput[1];
            String currentTown = currentInput[2];

            continentCountryCity.putIfAbsent(currentContinent, new LinkedHashMap<>());
            continentCountryCity.get(currentContinent).putIfAbsent(currentCountry, new ArrayList<>());
            continentCountryCity.get(currentContinent).get(currentCountry).add(currentTown);

        }

        continentCountryCity
                .entrySet()
                .forEach(continent -> {

                    System.out.println(String.format("%s:", continent.getKey()));

                    continent
                            .getValue()
                            .entrySet()
                            .forEach(country -> {

                                StringBuilder sb = getStringBuilder(country);
                                System.out.println(String.format(" %s -> %s", country.getKey(), sb.toString()));

                            });
                });

    }

    private static StringBuilder getStringBuilder(Map.Entry<String, ArrayList<String>> country) {
        String currentCountry = country.getKey();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < country.getValue().size(); i++) {
            if (i < country.getValue().size() - 1) {
                sb.append(country.getValue().get(i) + ", ");
            } else {
                sb.append(country.getValue().get(i));
            }
        }
        return sb;
    }
}
