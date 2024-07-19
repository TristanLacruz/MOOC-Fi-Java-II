
import java.util.ArrayList;


/**
 *
 * @author trist
 */
public class Box implements Packable {

    private ArrayList<Packable> items;
    private double maxCapacity;
    
    public Box(double capacity){
        items = new ArrayList<>();
        maxCapacity = capacity;
    }
    
    public void add(Packable item){
        if(item.weight() <= this.maxCapacity){
            items.add(item);
            this.maxCapacity -= item.weight();
        }
    }
    
    @Override
    public String toString(){
        return "Box: " + items.size() + " items, total weight " + weight() + " kg";
    }
    
    @Override
    public double weight() {
        double sum = 0;
        for (Packable item : items) {
            sum += item.weight();
        }
        return sum;
    }
    
}
