public class Book extends ShopItem {
    private String author;
    public Book(String author, String title) {
        this.author = author;
        setTitle(title);
    }
    public String getAuthor() {
        return author;
    }
    @Override
    public String toString() {
        return "Book: " + getTitle() + ", by " + author;
    }
}