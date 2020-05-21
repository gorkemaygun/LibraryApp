public class Book extends LibraryItem {

    private double price;

    public Book(String title, String author, String publisher, String type, String ISBN, int releaseYear,
            double price) {
        super(title, author, publisher, type, ISBN, releaseYear);
        this.price = price;

    }

    // Getters
    public double getPrice() {
        return price;
    }

    // Setters
    public void setPrice(double price) {
        this.price = price;
    }

}