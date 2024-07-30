package FlightControl.domain;

/**
 *
 * @author trist
 */
public class Place {

    private String ID;

    public Place(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return this.ID;
    }
}
