package mylibrary;

import java.util.Scanner;

public class LibraryManagementSystem {
	public static void main(String[] args) {
		Library library = new Library();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\nLibrary Management System");
			System.out.println("1. Add Book");
			System.out.println("2. Display Available Books");
			System.out.println("3. Borrow Book");
			System.out.println("4. Return Book");
			System.out.println("5. Quit");

			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			switch (choice) {
			case 1:
				System.out.print("Enter book title: ");
				String title = scanner.nextLine();
				System.out.print("Enter author name: ");
				String author = scanner.nextLine();
				library.addBook(title, author);
				System.out.println("Book added successfully.");
				break;
			case 2:
				library.displayBooks();
				break;
			case 3:
				System.out.print("Enter the title of the book to borrow: ");
				String borrowTitle = scanner.nextLine();
				if (library.borrowBook(borrowTitle)) {
					System.out.println("Book borrowed successfully.");
				} else {
					System.out.println("Book not available or does not exist.");
				}
				break;
			case 4:
				System.out.print("Enter the title of the book to return: ");
				String returnTitle = scanner.nextLine();
				if (library.returnBook(returnTitle)) {
					System.out.println("Book returned successfully.");
				} else {
					System.out.println("Book not found or already returned.");
				}
				break;
			case 5:
				System.out.println("Goodbye!");
				scanner.close();
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}

}
