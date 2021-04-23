import java.util.*;

public class mapsDemo04CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Map<String, ArrayList<String>>> continentsCountriesCities = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String continent = input[0];
            String country = input[1];
            String city = input[2];

            continentsCountriesCities.putIfAbsent(continent, new LinkedHashMap<>());
            continentsCountriesCities.get(continent).putIfAbsent(country, new ArrayList<>());
            continentsCountriesCities.get(continent).get(country).add(city);
        }

        for (Map.Entry<String, Map<String, ArrayList<String>>> continent : continentsCountriesCities.entrySet()) {
            StringBuilder sb = new StringBuilder();
            String continentName = continent.getKey();
            sb.append(continentName + ":").append(System.lineSeparator());
            Set<Map.Entry<String, ArrayList<String>>> entries = continent.getValue().entrySet();
            for (Map.Entry<String, Map<String, ArrayList<String>>> stringMapEntry : continentsCountriesCities.entrySet()) {
                Map<String, ArrayList<String>> value = stringMapEntry.getValue();
                for (Map.Entry<String, ArrayList<String>> stringArrayListEntry : value.entrySet()) {
                    String countryName = stringArrayListEntry.getKey();
                    sb.append(continentName + " -> ");
                    for (int i = 0; i <stringArrayListEntry.getValue().size(); i++) {
                        String city = stringArrayListEntry.getValue().get(i);
                        sb.append(city + ", ");
                    }
                }
            }
            System.out.println(sb.toString().trim());

        }

    }
}
