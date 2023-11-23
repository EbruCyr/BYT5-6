import java.util.ArrayList;
import java.util.List;


class Library {
    private int maxBooks;
    private List<Book> bookPool;

    public Library(int maxBooks) {
        this.maxBooks = maxBooks;
        this.bookPool = new ArrayList<>();
        initializeBookPool();
    }

    private void initializeBookPool() {
        for (int i = 1; i <= maxBooks; i++) {
            bookPool.add(new Book("Book " + i));
        }
    }

    public Book borrowBook() {
        if (!bookPool.isEmpty()) {
            Book borrowedBook = bookPool.remove(0);
            System.out.println("Book borrowed: " + borrowedBook.getTitle());
            return borrowedBook;
        } else {
            System.out.println("No available books. Please wait.");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return borrowBook();
        }
    }

    public void returnBook(Book returnedBook) {
        System.out.println("Book returned: " + returnedBook.getTitle());
        bookPool.add(returnedBook);
    }
}