
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();
        
        while (true) {
            System.out.println("First: " + first.contains() + "/" + first.getCapacity());
            System.out.println("Second: " + second.contains() + "/" + second.getCapacity());

            String input = scan.nextLine();
            if(input.equals("quit")){
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);
            
            switch(command){
                case "add":
                    first.add(amount);
                    break;
                case "move":
                    //we add to the container, the amount (containerCapacity - amount)
                    second.add(Math.min(first.contains(), amount));
                    first.remove(amount);
                    break;
                case "remove":
                    second.remove(amount);
                    break;
            }
        }
    }

}
