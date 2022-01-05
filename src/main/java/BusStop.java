import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name) {
        this.name = name;
        this.queue = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getQueueLength() {
        return this.queue.size();
    }

    public void addPassengerToQueue(Person person) {
        this.queue.add(person);
    }

    public Person removePassengerFromQueue() {
        Person person = this.queue.get(0);
        this.queue.remove(0);
        return person;
    }

}
