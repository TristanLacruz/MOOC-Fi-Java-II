
import java.util.ArrayList;

/**
 *
 * @author trist
 */
public class BoxWithMaxWeight extends Box {

    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (item.getWeight() <= this.capacity) {
            this.capacity -= item.getWeight();
            items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if (items.contains(item)) {
            return true;
        } else {
            return false;
        }
    }

}
