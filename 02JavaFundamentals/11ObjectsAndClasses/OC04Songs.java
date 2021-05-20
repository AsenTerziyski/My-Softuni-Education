import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OC04Songs {
    public static class Songs {
        String typeList;
        String name;
        String time;
        // конструктор:
        public Songs(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

//        public void setTypeList(String typeList) {
//            this.typeList = typeList;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public void setTime(String time) {
//            this.time = time;
//        }

        public String getName() {
            return name;
        }

        public String getTypeList() {
            return typeList;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfSongs = Integer.parseInt(scanner.nextLine());
        List<Songs> songsList = new ArrayList<>();
        for (int i = 0; i < numberOfSongs; i++) {
            String[] inputArray = scanner.nextLine().split("_");
            // razdelyam inputArray na tokkens:
            String typeListInput = inputArray[0];
            String songName = inputArray[1];
            String songTime = inputArray[2];
            //Pravya promenliva ot tip Songs, koyato se kazva song:
            Songs song = new Songs(typeListInput,songName,songTime);
            //setvam:

            //dobavyam v lista:
            songsList.add(song);
        }

        String inputTypeList = scanner.nextLine();

        if (inputTypeList.equals("all")) {
            for (int i = 0; i < songsList.size(); i++) {
                System.out.println(songsList.get(i).getName());
            }

        } else {
            for (int i = 0; i < songsList.size(); i++) {
                if (inputTypeList.equals(songsList.get(i).getTypeList())) {
                    System.out.println(songsList.get(i).getName());
                }
            }
        }
    }
}
