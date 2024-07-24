import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UserInterface {
    
    private Scanner scanner;
    
    public UserInterface(Scanner scanner){
        this.scanner = scanner;
    }
    
    public void start(){
        ArrayList<Book> books = new ArrayList<>();
        while (true) {
            System.out.println("Input the name of the book, empty stops: ");
            String name = scanner.nextLine().trim();
            if(name.isEmpty()){
                break;
            }
            System.out.println("Input the age of the book, empty stops: ");
            String age = scanner.nextLine().trim();
            if(age.isEmpty()){
                break;
            }
            Book book = new Book(name, Integer.parseInt(age));
            books.add(book);
        }
        
        Collections.sort(books);
        
        System.out.println(books.size() + " books in total.");
        System.out.println("Books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
