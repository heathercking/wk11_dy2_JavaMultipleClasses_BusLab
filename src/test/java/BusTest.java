import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;


    @Before
    public void before() {
        bus = new Bus("Edinburgh Waverley", 4);
        person = new Person();
    }

    @Test
    public void hasDestination() {
        assertEquals("Edinburgh Waverley", bus.getDestination());
    }

    @Test
    public void hasCapacity() {
        assertEquals(4, bus.getCapacity());
    }

    @Test
    public void canAddPassengers() {
        bus.addPassengers(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void canNotAddPassengerIfFull() {
        bus.addPassengers(person);
        bus.addPassengers(person);
        bus.addPassengers(person);
        bus.addPassengers(person);
        bus.addPassengers(person);
        assertEquals(4, bus.passengerCount());
    }

    @Test
    public void canRemovePassengerFromBus() {
        bus.addPassengers(person);
        bus.addPassengers(person);
        bus.removePassenger();
        assertEquals(1, bus.passengerCount());

    }

}
