import java.util.ArrayList;
import java.time.LocalDate;

public class event {
    private String eventName;
    private LocalDate date;
    private String location;
    private int totalTickets;
    private int ticketsRemaining;
    private int price;
    private organizer organizer;

    //Fjernes fordi f.eks. en sopptur ikke trenger ikke noen liste over kino-visninger osv
    //private static ArrayList<event> eventList = new ArrayList();

    private ArrayList<ticket> tickets = new ArrayList();

    //Fjernes fordi at vi i ticket.java så holder vi styr på om billetten faktisk har blitt brukt
    //private ArrayList<ticket> tickets = new ArrayList<>();

    public event(String eventName, LocalDate date, String location, int totalTickets, int ticketsRemaining, organizer organizer, int price) {
        this.eventName = eventName;
        this.date = date;
        this.location = location;
        this.price = price;
        this.totalTickets = totalTickets;
        this.ticketsRemaining = ticketsRemaining;
        this.organizer = organizer;
        //event.getEventList().add(this);
    }

    public event(String eventName, LocalDate date, String location, int price) {
        this.eventName = eventName;
        this.date = date;
        this.location = location;
        this.price = price;
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

    public int getPrice() {
        return price;
    }


    //Returnerer en liste over alle eventets billetter som fortsatt er gyldige/ubrukte
    public ArrayList<ticket> getValidTickets() {
        ArrayList <ticket> validTickets = new ArrayList(tickets);
        for (int i = 0; i < tickets.size(); i++){
            if(tickets.get(i).isValid()) {
                validTickets.add(tickets.get(i));
            }
        }
        return validTickets;
    }

    //Sjekker om den angitte billett er gyldig/ubrukt til dette eventet
    public boolean checkValid (ticket ticket) {
        int index=tickets.indexOf(ticket);
        if(index>=0) { // Finnes billetten i dette eventet?
            if(tickets.get(index).isValid()) { // Og er den gyldig?
                System.out.println("Denne billetten er gyldig");
                return true;
            }
        }
        return false;
    }

    //Brukes til å administrere hvilke billetter som er gyldige for dette event
    public void addTicket(ticket ticket){
        tickets.add(ticket);
    }

    @Override
    public String toString(){
        return eventName + "\n" + date + "\n" + location + "\n" + "Organizer: " + String.valueOf(organizer);
    }
}