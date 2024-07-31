
import java.util.ArrayList;

/**
 *
 * @author trist
 * @param <T>
 */
public class Pipe<T> {

    private ArrayList<T> elements;

    public Pipe(){
        this.elements = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        elements.add(value);
    }
    
    public T takeFromPipe(){
        if(elements.isEmpty()){
            return null;
        }
        T taken = elements.get(0);
        elements.remove(taken);
        return taken;
    }
    
    public boolean isInPipe(){
        return !elements.isEmpty();
    }

}
