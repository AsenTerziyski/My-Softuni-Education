package IC02Library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book {
    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... authors) {
        this.setTitle(title);
        this.setYear(year);
        this.setAuthors(authors);
    }

    private void setAuthors(String... authors) {
        if (authors.length == 0) {
            this.authors = new ArrayList<String>();
        } else {
            this.authors = new ArrayList<>(Arrays.asList(authors));
        }
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    //    @Override
//    public String toString() {
//        String title = this.title;
//        String year = String.valueOf(this.year);
//        StringBuilder sb = new StringBuilder();
//        for (String author : this.authors) {
//            sb.append(author).append("; ");
//        }
//        String output = String.format("%s, %s, %s", title, year, sb.toString().trim());
//        String exitString = output.trim();
//        exitString = exitString.substring(0, exitString.length()-1);
//        return exitString;
//    }
}
