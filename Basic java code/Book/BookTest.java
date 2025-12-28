public  class BookTest {
    public static void main(String[] args) {

        Book[] books = new Book[3];

        books[0] = new Book("1984", "George Orwell", 328);
        books[1] = new Book("The Hobbit", "J.R.R. Tolkien", 310);
        books[2] = new Book("To Kill a Mockingbird", "Harper Lee", 281);

        System.out.println("--- Book Details (Array Version) ---");
        for (Book b : books) {
            b.display();
            System.out.println();
        }
    }
}
