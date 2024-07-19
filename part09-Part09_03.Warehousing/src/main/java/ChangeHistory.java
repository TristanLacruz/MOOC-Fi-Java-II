
import java.util.ArrayList;


/**
 *
 * @author trist
 */
public class ChangeHistory {
    
    private ArrayList<Double> history;
    
    public ChangeHistory(){
        history = new ArrayList<>();
    }
    
    public void add(double status){
        history.add(status);
    }
    
    public void clear(){
        history.clear();
    }
    
    public double maxValue() {
        double max = -Double.MAX_VALUE;
        for (Double aDouble : history) {
            if (max < aDouble) {
                max = aDouble;
            }
        }
        return max;
    }

    
    public double minValue(){
        double min = Double.MAX_VALUE;
        for (Double aDouble : history) {
            if(min > aDouble){
                min = aDouble;
            }
        }
        return min;
    }
    
    public double average(){
        if(history.size() == 0){
            return 0;
        }else{
            double sum = 0;
            for (Double aDouble : history) {
                sum += aDouble;
            }
            return sum/history.size();
        }
    }
    
    @Override
    public String toString(){
        return history.toString();
    }
}
