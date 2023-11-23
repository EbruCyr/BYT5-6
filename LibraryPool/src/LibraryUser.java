class LibraryUser {
    private String name;

    public LibraryUser(String name) {
        this.name = name;
    }

    public void borrowBook(Library library) {
        Book borrowedBook = library.borrowBook();
        System.out.println(name + " borrowed: " + borrowedBook.getTitle());
    }

    public void returnBook(Library library, Book returnedBook) {
        library.returnBook(returnedBook);
        System.out.println(name + " returned: " + returnedBook.getTitle());
    }
}