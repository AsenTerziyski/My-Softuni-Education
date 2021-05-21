import java.util.Scanner;

public class OCU02Articles {
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

        @Override
        public String toString() {
            return String.format("%s - %s: %s",this.title, this.content, this.author );
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] articleInput = scanner.nextLine().split(", ");
        Articles article = new Articles();
        article.setTitle(articleInput[0]);
        article.setContent(articleInput[1]);
        article.setAuthor(articleInput[2]);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String inputTo = scanner.nextLine();
            String [] tokkens = inputTo.split(": ");
            String command = tokkens[0];
            String toEdit = tokkens[1];
            editArticle(article, command, toEdit);
        }
        System.out.println(article);
    }

    private static void editArticle(Articles article, String command, String toEdit) {
        switch (command) {
            case "Edit":
                article.setContent(toEdit);
                break;
            case "ChangeAuthor":
                article.setAuthor(toEdit);
                break;
            case "Rename":
                article.setTitle(toEdit);
                break;
        }
    }
}
