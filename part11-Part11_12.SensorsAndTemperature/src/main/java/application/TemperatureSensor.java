package application;

/**
 *
 * @author trist
 */
public class TemperatureSensor implements Sensor {

    private boolean isOn;
    private int value;

    public TemperatureSensor(){
        this.isOn = false;
    }
    
    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void setOn() {
        this.isOn = true;
    }

    @Override
    public void setOff() {
        this.isOn = false;
    }

    @Override
    public int read() {
        if(isOn()){
            return (int) (Math.random() * (30 - 31)) + 30;
        }else{
            throw new IllegalStateException("Illegal state!");
        }
    }

}
