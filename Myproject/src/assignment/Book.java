package assignment;

public class Book {
	String title;
    String author;
    
    public Book(String bookTitle, String bookAuthor) {
        title = bookTitle;   
        author = bookAuthor; 
    }
    
    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Java: The Complete Reference", "Herbert Schildt");
        
        book1.displayDetails();
        
       
    }
}


