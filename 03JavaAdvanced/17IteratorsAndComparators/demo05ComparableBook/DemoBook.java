package demo05ComparableBook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoBook {
    private String title;
    private int year;
    private List<String> authors;
    private static int bookIndex = 0;
    private int bookNumber;


    public DemoBook(String title, int year, String... authors) {
        this.setTitle(title);
        this.setYear(year);
        this.setAuthors(authors);
        bookIndex +=1;
        this.bookNumber = bookIndex;
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

    private void setAuthors(String... authors) {
        if (authors == null) {
            throw new IllegalArgumentException(DemoExceptionMessages.NOT_VALID_AUTHORS);
        }
        if (authors.length == 0) {
            this.authors = new ArrayList<>();
        }
        this.authors = new ArrayList<>(Arrays.asList(authors));
    }

    private void setYear(int year) {
        if (year <= 0) {
            throw new IllegalArgumentException(DemoExceptionMessages.NOT_VALID_YEAR);
        }
        this.year = year;
    }

    private void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException(DemoExceptionMessages.NOT_VALID_TITLE);
        }
        this.title = title;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(System.lineSeparator());
        for (int i = 0; i < authors.size(); i++) {
            sb.append(this.authors.get(i) +", ");
        }
        String substring = sb.substring(0, sb.length() - 2);
        return String.format("BOOK No: %d TITLE: %s, YEAR: %d,%n   AUTHORS: %s;", bookNumber,this.title, this.year, substring.trim());
    }
}
