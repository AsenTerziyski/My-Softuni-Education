import java.util.ArrayList;
import java.util.Scanner;

public class OC04SongsSetters {
    static class SongInfo {
        String typeList;
        String songName;
        String songTime;

        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }

        public void setSongName(String songName) {
            this.songName = songName;
        }

        public void setSongTime(String songTime) {
            this.songTime = songTime;
        }

        public String getTypeList() {
            return typeList;
        }

        public String getSongName() {
            return songName;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfSongs = Integer.parseInt(scanner.nextLine());
        ArrayList<SongInfo> songList = new ArrayList<>();

        for (int i = 0; i < numberOfSongs; i++) {

            String[] inputSong = scanner.nextLine().split("_");
            String inputTypeList = inputSong[0];
            String inputSongName = inputSong[1];
            String inputSongTime = inputSong[2];

            //сетвам информацията за всяка песен:
            SongInfo songInformation = new SongInfo();
            songInformation.setTypeList(inputTypeList);
            songInformation.setSongName(inputSongName);
            songInformation.setSongTime(inputSongTime);

            //добавям всяка песен в листа:
            songList.add(songInformation);

        }

        String printOnlyThisTypeList = scanner.nextLine();
        printOnlyDesiredListSongs(songList, printOnlyThisTypeList);

    }

    private static void printOnlyDesiredListSongs(ArrayList<SongInfo> songList, String printOnlyThisTypeList) {
        if (printOnlyThisTypeList.equals("all")) {
            for (int i = 0; i < songList.size(); i++) {
                System.out.print(songList.get(i).getSongName());
            }

        } else {
            for (int i = 0; i < songList.size(); i++) {
                if (printOnlyThisTypeList.equals(songList.get(i).getTypeList())) {
                    System.out.println(songList.get(i).getSongName());
                }
            }
        }

    }
}
