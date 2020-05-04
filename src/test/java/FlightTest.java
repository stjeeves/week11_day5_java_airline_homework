import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    PlaneType planeType;
    Passenger passenger;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(plane,"XX123","HKX","EDI","0900");
        passenger = new Passenger("Jeff", 2);
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
    public void checkAddPassengerToFlight(){
        flight.addPassengerToFlight(passenger);
        assertEquals(1, flight.passengers.size());
    }

    @Test
    public void checkAvailableSeats(){
        flight.addPassengerToFlight(passenger);
        assertEquals(249, flight.getAvailableSeats());
    }

    @Test
    public void checkCanBookSeat(){
        flight.BookSeat(passenger);
        assertEquals(1, flight.passengers.size());
    }

}
