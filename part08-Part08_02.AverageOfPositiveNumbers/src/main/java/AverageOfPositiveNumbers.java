
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                printAverage(numbers);
                break;
            }
            if (number > 0) {
                numbers.add(number);
            }
        }
    }
    
    private static void printAverage(ArrayList<Integer> numbers){
        if(numbers.isEmpty()){
            System.out.println("Cannot calculate the average");
            return;
        }
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        double result = (double)sum/numbers.size();
        System.out.println(result);
    }
}

 