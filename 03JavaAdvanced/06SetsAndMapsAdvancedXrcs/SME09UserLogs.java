import java.util.*;
import java.util.regex.Matcher;

public class SME09UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String, Integer>> userInfo = new TreeMap<>();

        String input = scanner.nextLine();
        while (!input.equalsIgnoreCase("end")) {

            String[] tokens = input.split("\\s+");
            String ip = tokens[0].split("=")[1];
            String userName = tokens[2].split("=")[1];

            userInfo.putIfAbsent(userName, new LinkedHashMap<>());
            userInfo.get(userName).putIfAbsent(ip, 0);
            userInfo.get(userName).put(ip, userInfo.get(userName).get(ip) + 1);

            input = scanner.nextLine();

        }
//        userInfo.entrySet().stream().forEach(e->{
//            String userNameToPrint = e.getKey();
//
//            System.out.println(String.format("%s:", userNameToPrint));
//
//            e.getValue().entrySet().stream().forEach(ip-> {
//                String ipToPrint = ip.getKey();
//                int countsToPrint = ip.getValue();
//                StringBuilder sb = new StringBuilder();
//                String ipInfo = String.format("%s => %d", ipToPrint, countsToPrint);
//                sb.append(ipInfo);
//                sb.append(", ");
//                String exitString = sb.substring(0, sb.length()-1);
//                System.out.println(exitString);
//            });
//
//        });
        for (Map.Entry<String, Map<String, Integer>> entry : userInfo.entrySet()) {
            System.out.println(entry.getKey() + ": ");
            Map<String, Integer> innerMap = entry.getValue();
            StringBuilder sb = new StringBuilder();

            for (Map.Entry<String, Integer> innerEntry : innerMap.entrySet()) {
                String ipInfo = String.format("%s => %d", innerEntry.getKey(), innerEntry.getValue());
                sb.append(ipInfo);
                sb.append(", ");

            }

            String output = sb.substring(0, sb.length()-2);
            System.out.println(output + ".");

        }

    }
}
