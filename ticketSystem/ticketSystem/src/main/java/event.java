import java.util.ArrayList;
import java.time.LocalDate;

public class event {
    private String eventName;
    private LocalDate date;
    private String location;
    private int stage;
    private int totalTickets;
    private int ticketsRemaining;
    private organizer organizer;
    private boolean isMovie;
    private int price;
    private static ArrayList<event> allEvents = new ArrayList();
    private static ArrayList<event> filmList = new ArrayList();
    private static ArrayList<event> otherEvents = new ArrayList();

    private ArrayList<ticket> ticketsForEvent = new ArrayList();

    //Fjernes fordi at vi i ticket.java så holder vi styr på om billetten faktisk har blitt brukt
    //private ArrayList<ticket> tickets = new ArrayList<>();

    //Constructor for all movies
    public event(String eventName, LocalDate date, String location, int stage, int totalTickets, int ticketsRemaining, organizer organizer, int price, boolean isMovie) {
        this.eventName = eventName;
        this.date = date;
        this.location = location;
        this.stage = stage;
        this.price = price;
        this.totalTickets = totalTickets;
        this.ticketsRemaining = ticketsRemaining;
        this.organizer = organizer;
        this.isMovie = isMovie;
        event.getAllEvents().add(this);
        event.getFilmList().add(this);
    }

    //Constuctor for all other events
    public event(String eventName, LocalDate date, String location, int totalTickets, int ticketsRemaining,
                 organizer organizer, int price, boolean isMovie) {
        this.eventName = eventName;
        this.date = date;
        this.location = location;
        this.price = price;
        this.totalTickets = totalTickets;
        this.ticketsRemaining = ticketsRemaining;
        this.organizer = organizer;
        this.isMovie = isMovie;
        event.getAllEvents().add(this);
        event.getOtherEvents().add(this);
    }


    public static ArrayList<event> getOtherEvents() {
        return otherEvents;
    }

    public static void setOtherEvents(ArrayList<event> otherEvents) {
        event.otherEvents = otherEvents;
    }

    public static ArrayList<event> getFilmList() {
        return filmList;
    }

    public static void setFilmList(ArrayList<event> filmList) {
        event.filmList = filmList;
    }

    public boolean isMovieEvent() {
        return isMovie;
    }

    public void setMovie(boolean movie) {
        isMovie = movie;
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

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ArrayList<ticket> getTicketsForEvent() {
        return ticketsForEvent;
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

    public static ArrayList<event> getAllEvents() {
        return allEvents;
    }

    public static void setEventList(ArrayList<event> allEvents) {
        event.allEvents = allEvents;
    }



    //Returnerer en liste over alle eventets billetter som fortsatt er gyldige/ubrukte
    public ArrayList<ticket> getValidTickets() {

        ArrayList <ticket> validTickets = new ArrayList(ticketsForEvent);

        for (int i = 1; i < ticketsForEvent.size(); i++){

            if(ticketsForEvent.get(i).isValid()) {
                validTickets.add(ticketsForEvent.get(i));
            }
        }
        return validTickets;
    }
    
    //Sjekker om den angitte billett er gyldig/ubrukt til dette eventet
    public boolean checkValid (ticket ticket) {

            if (ticket.isValid()){

                System.out.println("Denne billetten er gyldig!");
                return true;
            }
            else {
                System.out.println("Billetten er ikke gyldig!");
                return false;
            }

        //return false;
    }

    //Brukes til å administrere hvilke billetter som er gyldige for dette event
    public void addTicketToTicketlist(ticket ticket){
        ticketsForEvent.add(ticket);
    }

    @Override
    public String toString(){
        return "\n****************\n" + eventName + "\n" + date + "\nSted: " + location + "\n" + "Organizer: " + String.valueOf(organizer.getCompany() +
                "\n");
    }
}