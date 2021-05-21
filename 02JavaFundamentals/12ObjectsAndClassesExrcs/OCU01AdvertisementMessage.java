import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class OCU01AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] phrases = new String[]{"Excellent product.",
                "Such a great product.", "I always use that product.",
                "Best product of its category.", "Exceptional product.",
                "I can’t live without this product."};

        String[] events = new String[]{"Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.", "I feel great!"};

        String[] authors = new String[]{"Diana", "Petya", "Stella",
                "Elena", "Katya", "Iva", "Annie", "Eva"};

        String[] cities = new String[]{"Burgas", "Sofia",
                "Plovdiv", "Varna", "Ruse"};
        int n = Integer.parseInt(scanner.nextLine());
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            String phrase = phrases[rnd.nextInt(phrases.length)];
            String event = events[rnd.nextInt(events.length)];
            String author = authors[rnd.nextInt(authors.length)];
            String city = cities[rnd.nextInt(cities.length)];
            String result = String.format("%s %s %s – %s.", phrase,event,author, city);
            //валидация дали не се повтарят:
            ArrayList<String> coll = new ArrayList<>();
            coll.add(result);
            for (int j = 0; j <coll.size(); j++) {
                for (int k = j+1; k <coll.size(); k++) {
                    if (coll.get(j).equals(coll.get(k))) {
                        coll.remove(k);
                        k--;
                    }
                }
            }
            System.out.println(result);
        }
    }
}
