public class HArticle {
    private String title;
    private String content;
    private String author;

    public HArticle(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void edit(String content) {
        this.content = content;
    }

    public void changeAuthor(String author) {
        this.author = author;
    }

    public void rename(String title) {
        this.title = title;
    }

    public String toString() {
        return String.format("%s - %s: %s", this.title, this.content, this.author);
    }
}
