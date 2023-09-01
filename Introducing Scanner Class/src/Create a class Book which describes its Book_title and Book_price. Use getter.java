import java.util.Scanner;

class Book {
    private String bookTitle;
    private double bookPrice;

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }
}

class BookInfo {
    private static Scanner scanner;

	public static Book createBook() {
        Book book = new Book();
        scanner = new Scanner(System.in);

        System.out.print("Enter the book title: ");
        String title = scanner.nextLine();
        book.setBookTitle(title);

        System.out.print("Enter the book price: ");
        double price = scanner.nextDouble();
        book.setBookPrice(price);

        return book;
    }

    public static void showBook(Book book) {
        System.out.println("Book Title: " + book.getBookTitle());
        System.out.println("Book Price: " + book.getBookPrice());
    }
}

public class a7 {
    public static void main(String[] args) {
        Book book1 = BookInfo.createBook();
        Book book2 = BookInfo.createBook();

        System.out.println("\nBook 1 Information:");
        BookInfo.showBook(book1);

        System.out.println("\nBook 2 Information:");
        BookInfo.showBook(book2);
    }
}
