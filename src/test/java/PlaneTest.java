import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;
    PlaneType planeType;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void  checkPlaneHasType(){
        assertEquals(PlaneType.BOEING747, plane.getType());
    }
}
