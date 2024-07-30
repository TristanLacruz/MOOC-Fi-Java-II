
package FlightControl.domain;

/**
 *
 * @author trist
 */
public class Flight {
    
    private Airplane airplane;
    private Place departureAirport;
    private Place targeAirport;

    public Flight(Airplane airplane, Place departureAirport, Place targeAirport) {
        this.airplane = airplane;
        this.departureAirport = departureAirport;
        this.targeAirport = targeAirport;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public Place getDepartureAirport() {
        return departureAirport;
    }

    public Place getTargeAirport() {
        return targeAirport;
    }

    @Override
    public String toString() {
        return this.airplane.toString() + " (" + this.departureAirport + "-" + this.targeAirport + ")";
    }
    
    
}
