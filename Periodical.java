public class Periodical extends LibraryItem {
    private Subscription subscribe;

    public Periodical(String title, String author, String publisher, String type, String ISBN, int releaseYear,
            double price, Subscription subscribe) {
        super(title, author, publisher, type, ISBN, releaseYear);
        this.subscribe = subscribe;

    }

    public Subscription getSubscribe() {
        return subscribe;
    }

    public void setSubscrbe(Subscription subscribe) {
        this.subscribe = subscribe;
    }

}