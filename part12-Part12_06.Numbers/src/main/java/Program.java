
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many random numbers should be printed?");
        int count = Integer.valueOf(scanner.nextLine());
        printRandomNumbers(count);
    }
    
    public static void printRandomNumbers(int count){
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            System.out.println(random.nextInt(11));
        }
    }

}
