
import java.util.ArrayList;

/**
 *
 * @author trist
 */
public class Herd implements Movable {

    private ArrayList<Movable> herdList;

    public Herd() {
        herdList = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        herdList.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable element : herdList) {
            element.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String value = "";

        for (Movable organism : herdList) {
            value += organism.toString();
            value += "\n";
        }
        return value;
    }
}
