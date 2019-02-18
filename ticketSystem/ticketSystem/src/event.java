import java.util.ArrayList;
import java.util.Date;
import java.time.LocalDate;

public class event {
    public String eventName;
    private LocalDate date;
    private String location;
    private int totalTickets;
    private int ticketsRemaining;
    private organizer organizer;
    private static ArrayList<event> eventList = new ArrayList();

    public event(String eventName, LocalDate date, String location, int totalTickets, int ticketsRemaining, organizer organizer) {
        this.eventName = eventName;
        this.date = date;
        this.location = location;
        this.totalTickets = totalTickets;
        this.ticketsRemaining = ticketsRemaining;
        this.organizer = organizer;
        event.getEventList().add(this);
    }

    public event(String eventName, LocalDate date, String location) {
        this.eventName = eventName;
        this.date = date;
        this.location = location;
    }

    public event(LocalDate date, String location) {
        this.date = date;
        this.location = location;
    }

    public event(event eventName, LocalDate date, String location){

    }

    public String getEventName() {
        return eventName;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    public int getTotalTickets() {
        return totalTickets;
    }

    public int getTicketsRemaining() {
        return ticketsRemaining;
    }

    public organizer getOrganizer() {
        return organizer;
    }

    public static ArrayList<event> getEventList() {
        return eventList;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setTotalTickets(int totalTickets) {
        this.totalTickets = totalTickets;
    }

    public void setTicketsRemaining(int ticketsRemaining) {
        this.ticketsRemaining = ticketsRemaining;
    }

    public void setOrganizer(organizer organizer) {
        this.organizer = organizer;
    }

    @Override
    public String toString(){
        return eventName + "\n " + date + "\n " + location + "\n" + "Organizer: " + String.valueOf(organizer);
    }
}
