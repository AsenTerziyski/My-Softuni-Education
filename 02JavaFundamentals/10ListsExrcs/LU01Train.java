import java.util.ArrayList;
import java.util.Scanner;

public class LU01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listWagons = new ArrayList<>(addWagonsToIntegerList(scanner));

        int capacityOfWagon = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] tokens = input.split(" ");
            int sum = 0;
            if (tokens[0].equals("Add")) {
                listWagons.add(Integer.parseInt(tokens[1]));
            } else {
                for (int i = 0; i < listWagons.size(); i++) {
                    sum = Integer.parseInt(tokens[0]) + listWagons.get(i);
                    if (sum <= capacityOfWagon) {
                        listWagons.set(i, sum);
                        break;
                    }
                }
            }

            input = scanner.nextLine();
        }
//        for (Integer wagons : listWagons) {
//            System.out.print(wagons + " ");
//        }

        printList(listWagons);

    }

    private static void printList(ArrayList<Integer> listWagons) {
        for (int i = 0; i < listWagons.size(); i++) {
            if (i == listWagons.size() - 1) {
                System.out.print(listWagons.get(i));
            } else {
                System.out.print(listWagons.get(i) + " ");
            }
        }
    }

    private static ArrayList<Integer> addWagonsToIntegerList(Scanner scanner) {
        String[] stringArrayWagons = scanner.nextLine().split(" ");
        ArrayList<Integer> listWagons = new ArrayList<>();
        for (int i = 0; i < stringArrayWagons.length; i++) {
            int currentWagon = Integer.parseInt(stringArrayWagons[i]);
            listWagons.add(currentWagon);
        }
        return listWagons;
    }
}
