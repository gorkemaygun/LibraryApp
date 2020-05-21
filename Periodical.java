public class Periodical extends LibraryItem implements Reservable, Loanable {
    private Subscription subscribe;

    public Periodical(String title, String author, String publisher, String ISBN, int releaseYear, double price,
            Subscription subscribe) {
        super(title, author, publisher, ISBN, releaseYear);
        this.subscribe = subscribe;

    }

    public Subscription getSubscribe() {
        return subscribe;
    }

    public void setSubscrbe(Subscription subscribe) {
        this.subscribe = subscribe;
    }

    @Override
    public boolean isReservable() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isLoanable() {
        // TODO Auto-generated method stub
        return true;
    }

}