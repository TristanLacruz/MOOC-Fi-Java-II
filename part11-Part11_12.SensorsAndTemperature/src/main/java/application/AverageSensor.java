package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author trist
 */
public class AverageSensor implements Sensor {

    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> statistics;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.statistics = new ArrayList<>();
    }

    public void addSendor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : sensors) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        if (!this.isOn() || this.sensors.isEmpty()) {
            throw new IllegalStateException("Error!");
        } else {
            int avg = this.sensors.stream()
                    .map(sensor -> sensor.read())
                    .reduce(0, (prev, curr) -> prev + curr)
                    / this.sensors.size();
            return avg;
        }
    }

    public List<Integer> readings() {
        return this.statistics;
    }
}
