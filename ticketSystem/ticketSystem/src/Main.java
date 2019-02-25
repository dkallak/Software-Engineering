import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        organizer visitFredrikstad = new organizer("Lise","Lotte");
        event glommaFestivalen = new event ("Glommafestivalen", LocalDate.of(2019,06,15),"Fredrikstad",15000,15000,visitFredrikstad, 1500);

        ticket movieTicket = new ticket(glommaFestivalen.getEventName(),LocalDate.of(2019, 04, 15),"Fredrikstad",1500);

        ticket soppticket1 = new ticket(glommaFestivalen.getEventName(), LocalDate.of(2019, 07,30), "Halden", 1500);



        customer john = new customer("John", "Johnsson", 14);

        payment JohnsPayment = new payment(john.getFirstName(), john.getLastName(), 13, 333, 2019, 2025, 433, 1507);

        System.out.println(JohnsPayment);
        System.out.println("*************************");
        System.out.println(movieTicket);
        System.out.println("#########################");
        System.out.println(soppticket1);

        System.out.println(JohnsPayment.checkBalance(glommaFestivalen.getPrice(),JohnsPayment.getBalance()));
        JohnsPayment.setBalance(JohnsPayment.getBalance() - glommaFestivalen.getPrice());
        System.out.println(JohnsPayment);

    }
}
