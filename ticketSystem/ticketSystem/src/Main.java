import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        organizer visitFredrikstad = new organizer("Lise","Lotte");
        event glommaFestivalen = new event ("Glommafestivalen", LocalDate.of(2019,06,15),"Fredrikstad",15000,15000,visitFredrikstad);

        ticket movieTicket = new ticket(glommaFestivalen.getEventName(),LocalDate.of(2019, 04, 15),"Fredrikstad",15,8);

        ticket soppticket1 = new ticket(glommaFestivalen.getEventName(), LocalDate.of(2019, 07,30), "Halden");



        customer john = new customer("John", "Johnsson", 14);

        payment test = new payment(john.getFirstName(), john.getLastName(), 13, 333, 2013, 2021, 433);

        System.out.println(test);


        //That collection of classes seems pretty complete
        //
        //Your customer class probably needs an array / linked list of tickets, and a payment object. Ticket shouldn't be a subclass of event, a ticket isn't a type of event. Event should probably have an array of tickets valid for that event, Organizer should probably have an array of events they manage.
        //
        //
        //
        //
        //G: But the event class should not have an array holding customers objects right?
        //
        //It doesn't have to no
        //It depends on how (or if!) you need to track how many people are going to an event
        //
        //So what I'd do is have each ticket have a unique ID. Then, an event will have an array of unique IDs of valid tickets. So to check if a ticket is valid for a specific event, all you have to do is compare the ticket's unique ID to the list of unique IDs for an event!
        //
        //So yeah, you just need to track who has what ticket :)
    }
}
