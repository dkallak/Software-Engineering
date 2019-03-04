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
        event nemo = new event("Oppdrag Nemo", LocalDate.of(2019,03,05),"Festiviteten", 4, 200, 200, festiviteten, 200);
        event avatar = new event("Avatar", LocalDate.of(2019,03,06),"Festiviteten", 2, 400, 400, festiviteten, 200);
        event rainman = new event("Rain Man", LocalDate.of(2019,12,23),"Festiviteten", 1, 200, 200, festiviteten, 100);

        event fiskePir = new event("Fiske pir", LocalDate.of(2019,07,15), "Langvannet", 300, 300, dnt,300);


        //Oppretter payment
        payment betaling = new payment("martin", 222, 2,2,2,2000);

        //Oppretter en kunde
        customer martin = new customer("Martin", "Martinsen", 23, betaling);





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



        /*
        System.out.println(martin.getTickets());
        System.out.println(nemo.getTicketsRemaining());
        */

        //USE-CASE: Avbestilling/refundering
        //1 Refundering i form av penger eller goder
        //2 Billetten er nå tilgjengelig for andre
        //3

        //USE-CASE: Selge billett
        ticket nemoTicket1 = new ticket(nemo, 30, 8, martin);
        ticket pirTur2 = new ticket(fiskePir);

        fiskePir.addTicket(pirTur2);

        System.out.println("Organizer balance: ");
        System.out.println(dnt.getOrganizerBalance());
        System.out.println("Movie balance: ");
        System.out.println(festiviteten.getCinemaBalance());
        System.out.println("*****************");
        martin.addTicket(pirTur2,fiskePir);
        dnt.sellTicket(fiskePir);
        martin.addTicket(nemoTicket1,nemo);

        System.out.println("Organizer balance: ");
        System.out.println(dnt.getOrganizerBalance());
        System.out.println("Cinema balance: ");
        System.out.println(festiviteten.getCinemaBalance());
    }
}
