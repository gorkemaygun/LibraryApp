public class Book extends LibraryItem implements Loanable, Reservable {

    private double price;
    private Genre genre;

    public Book(String title, String author, String publisher, String ISBN, int releaseYear, double price,
            Genre genre) {
        super(title, author, publisher, ISBN, releaseYear);
        this.price = price;
        this.genre = genre;

    }

    // Getters
    public double getPrice() {
        return price;
    }

    public Genre getGenre() {
        return genre;
    }

    // Setters
    public void setPrice(double price) {
        this.price = price;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public boolean isLoanable() {
        // TODO Auto-generated method stub

        return true;
    }

    @Override
    public boolean isReservable() {
        // TODO Auto-generated method stub
        return true;
    }

}