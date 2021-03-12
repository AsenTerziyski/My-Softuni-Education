package Pr05Тelephony;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public List<String> getUrls() {
        return urls;
    }

    @Override
    public String browse() {
        Pattern pattern = Pattern.compile("^[\\D]+$");
        StringBuilder sb = new StringBuilder();
        for (String url : this.urls) {
            if (this.isValid(url, pattern)) {
                sb
                        .append(String.format("Browsing: %s!", url))
                        .append(System.lineSeparator());
            } else {
                sb
                        .append("Invalid URL!")
                        .append(System.lineSeparator());
            }
        }
        return sb.toString().trim();
    }

    @Override
    public String call() {
        Pattern pattern = Pattern.compile("^[0-9]+$");
        StringBuilder sb = new StringBuilder();
        for (String number : this.numbers) {
            if (this.isValid(number, pattern)) {
                sb
                        .append(String.format("Calling... %s", number))
                        .append(System.lineSeparator());
            } else {
                sb
                        .append("Invalid number!")
                        .append(System.lineSeparator());
            }
        }
        return sb.toString().trim();
    }

    private boolean isValid(String numberOrURL, Pattern pattern) {
        Matcher matcher = pattern.matcher(numberOrURL);
        return (matcher.find());
    }
}
