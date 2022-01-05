import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busStop;


    @Before
    public void before() {
        bus = new Bus("Edinburgh Waverley", 4);
        person = new Person();
        busStop = new BusStop("Edinburgh Waverley");
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
        bus.pickUpPassengersFromBusStop(busStop);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void canNotAddPassengerIfFull() {
        bus.pickUpPassengersFromBusStop(busStop);
        bus.pickUpPassengersFromBusStop(busStop);
        bus.pickUpPassengersFromBusStop(busStop);
        bus.pickUpPassengersFromBusStop(busStop);
        bus.pickUpPassengersFromBusStop(busStop);
        assertEquals(4, bus.passengerCount());
    }

    @Test
    public void canRemovePassengerFromBus() {
        bus.pickUpPassengersFromBusStop(busStop);
        bus.pickUpPassengersFromBusStop(busStop);
        bus.removePassenger();
        assertEquals(1, bus.passengerCount());

    }

}
