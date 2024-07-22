
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author trist
 */
public class UserInterface {
    
    private ArrayList<String> inputs;
    Scanner scanner;
    
    public UserInterface(Scanner scanner){
        this.scanner = scanner;
        this.inputs = new ArrayList<>();
    }
    
    public void start(){
        while (true) {
            System.out.println("Input numbers, type 'end' to stop");
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }
            inputs.add(input);
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String option = scanner.nextLine();
        switch(option){
            case "p":
                System.out.println(averagePositive());
                break;
            case "n":
                System.out.println(averageNegative());
                break;
        }
    }
    
    public double averagePositive(){
        return inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number > 0)
                .average()
                .getAsDouble();
    }
    
    public double averageNegative(){
        return inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number < 0)
                .average()
                .getAsDouble();
    }
    
}
