import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Stephen", 1);
    }

    @Test
    public void passengerHasName() {
        assertEquals("Stephen", passenger.getName());
    }

    @Test
    public void passengerHasBags(){
        assertEquals(1, passenger.getBags());
    }
}



