package Streams.Books;



public class Book {
    String title;
    int publicationYear;
    double price;
    String category;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", publicationYear=" + publicationYear +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }

    public Book(String category, int publicationYear, double price, String title) {
        this.category = category;
        this.publicationYear = publicationYear;
        this.price = price;
        this.title = title;
    }
}
