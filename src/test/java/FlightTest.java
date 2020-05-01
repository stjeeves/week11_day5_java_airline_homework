import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    PlaneType planeType;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(plane,"XX123","HKX","EDI","0900");
    }

    @Test
    public void checkFlightHasFlightNum(){
        assertEquals("XX123", flight.getFlightNum());
    }

    @Test
    public void checkFightHasDestination(){
        assertEquals("HKX", flight.getFlightDestination());
    }

    @Test
    public void checkFlightHasDepartureAirport(){
        assertEquals("EDI", flight.getFlightDepartureAirport());
    }

    @Test
    public void checkFlightHasDepartureTime(){
        assertEquals("0900", flight.getFlightDepartureTime());
    }

    @Test
    public void checkAvailableSeats(){
        assertEquals(250, flight.getAvailableSeats());
    }

}
