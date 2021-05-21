import java.util.ArrayList;
import java.util.Scanner;

public class OCU04Articles02 {

    static class Articles {
        String title;
        String content;
        String author;
        //String output;

        public void setTitle(String title) {
            this.title = title;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s", this.title, this.content, this.author);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Articles> listOfArticles = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] articleInput = scanner.nextLine().split(", ");
            fillArticleList(listOfArticles, articleInput);
        }

        String inputCriteria = scanner.nextLine();
        sortByCriteriaAndPrintArticleList(listOfArticles, inputCriteria);
    }

    private static void fillArticleList(ArrayList<Articles> listOfArticles, String[] articleInput) {
        Articles currentArticle = new Articles();
        currentArticle.setTitle(articleInput[0]);
        currentArticle.setContent(articleInput[1]);
        currentArticle.setAuthor(articleInput[2]);
        listOfArticles.add(currentArticle);
    }

    private static void sortByCriteriaAndPrintArticleList(ArrayList<Articles> listOfArticles, String inputCriteria) {
        switch (inputCriteria) {
            case "title":
                listOfArticles.stream().
                        sorted((a1, a2) -> a1.getTitle().compareTo(a2.getTitle())).
                        forEach(articles -> System.out.println(articles));
                break;
            case "content":
                listOfArticles.stream().
                        sorted((a1, a2) -> a1.getContent().compareTo(a2.getContent())).
                        forEach(articles -> System.out.println(articles));
                break;
            case "author":
                listOfArticles.stream().
                        sorted((a1, a2) -> a1.getAuthor().compareTo(a2.getAuthor())).
                        forEach(articles -> System.out.println(articles));
                break;
        }
    }
}
