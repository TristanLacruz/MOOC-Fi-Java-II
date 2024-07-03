
import java.util.Scanner;


/**
 *
 * @author trist
 */
public class UserInterface {
    
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start(){
        boolean running = true;
        while (running) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            switch(command){
                case "add":
                    System.out.print("Task: ");
                    String task = scanner.nextLine();
                    list.add(task);
                    break;
                case "list":
                    list.print();
                    break;
                case "remove":
                    System.out.print("Which one is removed?");
                    int index = Integer.valueOf(scanner.nextLine());
                    list.remove(index);
                    break;
                case "stop": 
                    running = false;
                    break;
                default: 
                    break;
            }
        }
    }
    
}
