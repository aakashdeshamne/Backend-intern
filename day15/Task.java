import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

class Book {
    List<Book> books = new ArrayList<>();
    String bookName;
    String authorName;
    String issuedTo = "None";
    String issuedOn = "None";
}

class BookMethods extends Book {
    public int startP() {
        System.out.print("\n1.Add Book\n2.Show Books\n3.Issue Book\n4.Return Book\n5.Exit\n\nYour Choice: ");
        try (Scanner sc = new Scanner(System.in)) {
            return sc.nextInt();
        }
    }

    public void addBook() {
        boolean continueAddingBooks = true;
        while (continueAddingBooks) {
            Book b = new Book();
            LocalDateTime dateTime = LocalDateTime.now();
            String formattedDateTime = dateTime.format(DateTimeFormatter.ofPattern("E, MMM dd yyyy, hh:mm a"));
            try (Scanner sc1 = new Scanner(System.in)) {
                System.out.print("\nThe book you want to add: ");
                b.bookName = sc1.nextLine();
                System.out.print("Author name: ");
                b.authorName = sc1.nextLine();
            }
            books.add(b);
            System.out.println("\n---You added " + b.bookName + " by " + b.authorName + " on " + formattedDateTime + "---");
            try (Scanner sc3 = new Scanner(System.in)) {
                System.out.print("\nDo you want to add more book?\n1.Yes\n2.No\nYour choice: ");
                int choice = sc3.nextInt();
                continueAddingBooks = (choice == 1);
            }
        }
    }

    public void showBook() {
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + "." + books.get(i).bookName + " issued to " + books.get(i).issuedTo);
        }
    }

    public void issueBook() {
        showBook();
        LocalDateTime dateTime2 = LocalDateTime.now();
        String formattedDateTime2 = dateTime2.format(DateTimeFormatter.ofPattern("E, MMM dd yyyy, hh:mm a"));
        try (Scanner sc4 = new Scanner(System.in)) {
            System.out.print("\nWhich book do you want to issue?\n- ");
            int bookChoice = sc4.nextInt() - 1;
            System.out.print("Your name: ");
            books.get(bookChoice).issuedTo = sc4.next();
            System.out.println("---" + books.get(bookChoice).bookName + " by " + books.get(bookChoice).authorName +
                    " issued to " + books.get(bookChoice).issuedTo + " on " + formattedDateTime2 + "---");
        }
    }

    public void returnBook() {
        try (Scanner sc6 = new Scanner(System.in)) {
            System.out.print("\nEnter the book name: ");
            String check = sc6.nextLine();
            String n = "None";
            for (int i = 0; i < books.size(); i++) {
                if (check.equals(books.get(i).bookName)) {
                    books.get(i).issuedTo = n;
                    showBook();
                    break;
                }
            }
        }
    }
}

public class Task {
    public static void main(String[] args) {
        System.out.println("Welcome to our Library!");
        BookMethods b1 = new BookMethods();
        boolean isRunning = true;
        while (isRunning) {
            int selectionFinally = b1.startP();
            switch (selectionFinally) {
                case 1:
                    b1.addBook();
                    break;
                case 2:
                    b1.showBook();
                    break;
                case 3:
                    b1.issueBook();
                    break;
                case 4:
                    b1.returnBook();
                    break;
                case 5:
                    isRunning = false;
                    break;
            }
        }
    }
}
