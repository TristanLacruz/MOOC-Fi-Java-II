
package application;

/**
 *
 * @author trist
 */
public class StandardSensor implements Sensor{

    private int value;
    
    public StandardSensor(int num){
        this.value = num;
    }
    
    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {
    }

    @Override
    public void setOff() {
    }

    @Override
    public int read() {
        if(true){
            return value;
        }else{
            throw new IllegalStateException("Illegal state!");
        }
    }
}
