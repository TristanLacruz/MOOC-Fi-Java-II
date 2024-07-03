
/**
 *
 * @author trist
 */
public class Container {
    
    private int liquid;
    private static final int capacity = 100;
    
    public Container(){}
    
    public int getCapacity(){
        return this.capacity;
    }
    
    public int contains(){
        return this.liquid;
    }
    
    public void add(int amount){
        if(amount > 0){
            liquid += amount;
        }
        if(liquid > capacity){
            liquid = capacity;
        }
    }
    
    public void remove(int amount){
        if(amount > 0){
            liquid -= amount;
        }
        if(liquid < 0){
            liquid = 0;
        }
    }
}
