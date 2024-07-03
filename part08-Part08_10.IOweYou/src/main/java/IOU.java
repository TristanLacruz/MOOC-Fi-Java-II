
import java.util.HashMap;

/**
 *
 * @author trist
 */
public class IOU {

    private HashMap<String, Double> map;
    
    public IOU(){
        map = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount){
        map.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom){
        double aux = map.getOrDefault(toWhom, 0.0);
        return aux;
    }
}
