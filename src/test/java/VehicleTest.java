import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class VehicleTest {

    @Test
    public void testGo() {
        Vehicle v = new Vehicle(10);
        v.go(3);
        assertEquals(30, v.getX());
    }

    @Test
    public void testBack() {
        Vehicle v = new Vehicle(10);
        v.go(5);
        v.back(2);
        assertEquals(30, v.getX());
    }

    @Test
    public void testDiff() {
        Vehicle v1 = new Vehicle(10);
        Vehicle v2 = new Vehicle(20);

        v1.go(3);
        v2.go(1);

        int result = Vehicle.diff(v1, v2);
        assertEquals(10, result);
    }
}

