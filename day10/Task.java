import java.util.*;

class Library {
    private ArrayList<String> books;
    private ArrayList<String> issuedBooks;

    public Library() {
        this.books = new ArrayList<>();
        this.issuedBooks = new ArrayList<>();
    }

    public void addBook(String bookTitle) {
        books.add(bookTitle);
        System.out.println(bookTitle + " has been added to the library.");
    }

    public void issueBook(String bookTitle) {
        if (books.contains(bookTitle)) {
            books.remove(bookTitle);
            issuedBooks.add(bookTitle);
            System.out.println("You have successfully issued " + bookTitle + ".");
        } else {
            System.out.println("Sorry, " + bookTitle + " is not available in the library.");
        }
    }

    public void availableBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("Available books in the library:");
            for (String book : books) {
                System.out.println(book);
            }
        }
    }
}


public class Task {
    public static void main(String[] args) {
        System.out.println("<-----------------Welcome To Library---------------->");
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;

        do {
            System.out.println("Tell me Your Occasion");
            System.out.println("1. Add a book");
            System.out.println("2. Issue a book");
            System.out.println("3. View available books");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the title of the book to add:");
                    String bookToAdd = scanner.next();
                    library.addBook(bookToAdd);
                    break;

                case 2:
                    System.out.println("These Are book available here pick from them");
                    library.availableBooks();
                    System.out.println("Enter the title of the book to issue:");
                    String bookToIssue = scanner.next();
                    library.issueBook(bookToIssue);
                    break;

                case 3:
                    library.availableBooks();
                    break;

                case 4:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }

        } while (!exit);
    }
}