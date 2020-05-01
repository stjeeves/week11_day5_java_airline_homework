import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNum;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private PlaneType planeType;

    public Flight(Plane plane, String flightNum, String destination, String departureAirport, String departureTime) {
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNum = flightNum;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public String getFlightNum() {
        return this.flightNum;
    }

    public String getFlightDestination() {
        return this.destination;
    }

    public String getFlightDepartureAirport() {
        return this.departureAirport;
    }

    public String getFlightDepartureTime() {
        return this.departureTime;
    }

    //book passengers method
        //check the remaining seats on the plane
        //if >= 1
        //add passengers to array list.
        //reduce capacity by one

    //return seats method
    public int getAvailableSeats() {
        return this.plane.planeType.getCapacity();
        //need to add in way to check this against the passengers array
    }
}
