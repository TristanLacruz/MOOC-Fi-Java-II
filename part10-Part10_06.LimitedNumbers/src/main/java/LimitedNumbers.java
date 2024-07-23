
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = scanner.nextInt();
            if(input < 0){
                break;
            }
            list.add(input);
        }
        list.stream()
                .filter(i -> i >= 1 && i <= 5)
                .forEach(element -> System.out.println(element));
    }
}
