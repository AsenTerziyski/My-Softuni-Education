import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OC04SongsUprazhnenie {
    static class SongsList {
        String songTypeList;
        String songName;
        String songTime;

        public String getSongTypeList() {
            return songTypeList;
        }

        public String getSongName() {
            return songName;
        }

        public String getSongTime() {
            return songTime;
        }

        public void setSongTypeList(String songTypeList) {
            this.songTypeList = songTypeList;
        }

        public void setSongName(String songName) {
            this.songName = songName;
        }

        public void setSongTime(String songTime) {
            this.songTime = songTime;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<SongsList> songs = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String[] input = scanner
                    .nextLine()
                    .split("_");

            String inputTypeList = input[0];
            String inputSongName = input[1];
            String inputSongTime = input[2];

            SongsList listOfSongs = new SongsList();
            listOfSongs.setSongTypeList(inputTypeList);
            listOfSongs.setSongName(inputSongName);
            listOfSongs.setSongTime(inputSongTime);

            songs.add(listOfSongs);

        }

        //songs.stream().sorted((s1, s2)-> s1.getSongName().compareTo(s2.getSongName())).forEach(s-> System.out.println(s.getSongName()));

        String printOnlyThisTypeList = scanner.nextLine();
        printDesiredSong(songs, printOnlyThisTypeList);
    }

    private static void printDesiredSong(List<SongsList> songs, String printOnlyThisTypeList) {
        for (int i = 0; i <songs.size(); i++) {
            if (printOnlyThisTypeList.equals("all")) {
                System.out.println(songs.get(i).getSongName());
            } else if (songs.get(i).getSongTypeList().equals(printOnlyThisTypeList)) {
                System.out.println(songs.get(i).getSongName());
            }
        }
    }
}
