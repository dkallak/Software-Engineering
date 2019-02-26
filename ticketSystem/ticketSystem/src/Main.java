import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Oppretter arragører
        organizer festiviteten = new organizer("Festiviteten", "Gunnhild", "Hansen");
        organizer dnt = new organizer("Det norske turistforeningen", "Lars", "Monsen");

        //Oppretter eventer
        event nemo = new event("Oppdrag Nemo", LocalDate.of(2019,03,05),"Festiviteten", 4, 200, 200, festiviteten, 140);
        event avatar = new event("Avatar", LocalDate.of(2019,03,06),"Festiviteten", 2, 400, 400, festiviteten, 200);
        event rainman = new event("Rain Man", LocalDate.of(2019,12,23),"Festiviteten", 1, 200, 200, festiviteten, 100);

        event fiskePir = new event("Fiske pir", LocalDate.of(2019,07,15), "Langvannet", 300, 300, dnt,30);

        //Oppretter en kunde
        customer martin = new customer("Martin", "Martinsen", 23);


        //USE-CASE: Sjekker utvalg

        //Utvalg alle filmer
        //System.out.println(event.getFilmList());

        //Utvalg absolutt alle events
        //System.out.println(event.getEventList());

        //Utvalg alle andre events
        //System.out.println(event.getOtherEvents());



        //USE-CASE: Kjøpe billett
        //1 holde av billett
        //2 opprette billettobjekt
        //3 Boolean, kjøp godkjent eller ikke

        ticket nemoTicket1 = new ticket(nemo, 30, 8, martin);
        martin.addTicket(nemoTicket1,nemo);
        System.out.println(martin.getTickets());


    }
}
