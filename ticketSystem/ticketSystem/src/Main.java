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


    }
}
