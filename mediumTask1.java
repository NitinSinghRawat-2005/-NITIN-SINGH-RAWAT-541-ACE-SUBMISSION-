package mediumTask1;

import java.util.*;

class Book {
    String title;
    String author;

    // Constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // To display book info
    public String toString() {
        return "Title: " + title + ", Author: " + author;
    }
}

public class mediumTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> library = new ArrayList<>();

        int choice = 0;
        while (choice != 4) {
            // Menu
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book by Title");
            System.out.println("3. Show All Books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    // Add book (title, author)
                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter book author: ");
                    String author = sc.nextLine();
                    library.add(new Book(title, author));
                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    // Search book
                    System.out.print("Enter title to search: ");
                    String searchTitle = sc.nextLine();
                    boolean found = false;
                    for (Book b : library) {
                        if (b.title.equalsIgnoreCase(searchTitle)) {
                            System.out.println("Book Found: " + b);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 3:
                    // Show all books
                    if (library.isEmpty()) {
                        System.out.println("No books in the library.");
                    } else {
                        System.out.println("\n--- Book List ---");
                        for (Book b : library) {
                            System.out.println(b);
                        }
                    }
                    break;

                case 4:
                    // Exit
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }

        sc.close();
    }
}
