public class GeneralBook extends Book {
    public GeneralBook(String title, String author, Genre genre, String publisher, String ISBN, int releaseYear,
            double price) {
        super(title, author, publisher, ISBN, releaseYear, price, genre);
    }
}