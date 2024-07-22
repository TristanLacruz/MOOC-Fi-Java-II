
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author trist
 */
public class UserInterface {

    Scanner scanner;
    ArrayList<String> numbers;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.numbers = new ArrayList<>();
    }

    public void start() {
        while (true) {
            System.out.println("Input numbers, type 'end' to stop.");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            numbers.add(input);
        }
        System.out.println("average of the numbers: " + average(numbers));
    }

    public double average(ArrayList<String> numbers) {
        return numbers.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();

    }

}
