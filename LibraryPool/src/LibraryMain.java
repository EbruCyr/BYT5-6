public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library(5);

        LibraryUser user1 = new LibraryUser("User 1");
        LibraryUser user2 = new LibraryUser("User 2");
        LibraryUser user3 = new LibraryUser("User 3");


        user1.borrowBook(library);
        Book returnedBook1 = new Book("Book 1");
        user1.returnBook(library, returnedBook1);
        user2.borrowBook(library);
        Book returnedBook2 = new Book("Book 2");
        user2.returnBook(library, returnedBook2);
        user3.borrowBook(library);
        Book returnedBook3 = new Book("Book 3");
        user3.returnBook(library, returnedBook3);


    }
}