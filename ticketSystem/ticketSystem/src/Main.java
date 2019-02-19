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

        //System.out.println(soppticket1.isValid());


        LocalDate dato = LocalDate.of(2019,04,15);


        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));

        //if (movieTicket.getDate() < date) {
        //    movieTicket.setValid(false);
        //}
        System.out.println(movieTicket);
        System.out.println(movieTicket.getDate());
        System.out.println(dato);
        System.out.println(soppticket1);
        System.out.println(movieTicket);


    }
}
