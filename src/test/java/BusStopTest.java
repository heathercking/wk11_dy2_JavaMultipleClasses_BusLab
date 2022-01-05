import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busstop;
    private Person person;

    @Before
    public void before() {
        busstop = new BusStop("Edinburgh Waverley");
        person = new Person();
    }

    @Test
    public void hasName() {
        assertEquals("Edinburgh Waverley", busstop.getName());
    }

    @Test
    public void hasQueue() {
        assertEquals(0, busstop.getQueueLength());
    }

    @Test
    public void canAddPassengerToQueue() {
        busstop.addPassengerToQueue(person);
        assertEquals(1, busstop.getQueueLength());
    }

    @Test
    public void canRemovePassengerFromQueue() {
        busstop.addPassengerToQueue(person);
        busstop.removePassengerFromQueue();
        assertEquals(0, busstop.getQueueLength());
    }

}
