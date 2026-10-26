public class Book {
    private String isbn;
    private String title;
    private String author;
    private int edition;
    private double price;
    private String publisher;

    public Book(String isbn, String title, String author, int edition, double price, String publisher) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.edition = edition;
        this.price = price;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return String.format("%-15s%-45s%-20s%-10d%-8.2f%-10s", this.isbn, this.title, this.author, this.edition, this.price, this.publisher);
    }

    public void setIsbn(String isbn) { this.isbn = isbn; }
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setEdition(int edition) { this.edition = edition; }
    public void setPrice(double price) { this.price = price; }
    public void setPublisher(String publisher) { this.publisher = publisher; }

    public String getIsbn() { return this.isbn; }
    public String getTitle() { return this.title; }
    public String getAuthor() { return this.author; }
    public int getEdition() { return this.edition; }
    public double getPrice() { return this.price; }
    public String getPublisher() { return this.publisher; }
}
