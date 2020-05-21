public class Library {
    public static void main(String[] args) {

        Book book = new Book("War and Peace", "Leo Tolstoy", "The Russian Messenger", "1686235248461", 1869, 25.90,
                Genre.CLASSIC);
        System.out.println(book.getGenre());

    }
}