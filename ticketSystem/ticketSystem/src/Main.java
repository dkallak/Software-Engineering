import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Oppretter arragører
        organizer askimKino = new organizer("askimKino", "Gunnhild", "Hansen");
        organizer dnt = new organizer("Det norske turistforeningen", "Lars", "Monsen");

        //Oppretter eventer
        event nemo = new event("Oppdrag Nemo", LocalDate.of(2019,03,05),"Askim", 4, 200, 200, askimKino, 200);
        event avatar = new event("Avatar", LocalDate.of(2019,03,06),"Askim", 2, 400, 400, askimKino, 200);
        event rainman = new event("Rain Man", LocalDate.of(2019,12,23),"Askim", 1, 200, 200, askimKino, 100);

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

        //USE-CASE: Avbestilling/refundering
        //1 Refundering i form av penger eller goder
        //2 Billetten er nå tilgjengelig for andre
        //3

        //USE-CASE: Selge billett
        cinema askim = new cinema("Nordisk Film", "Gunnhild", "Hansen", "Askim Kino", 0);

        ticket nemoTicket1 = new ticket(nemo, 30, 8, martin);
        ticket pirTur2 = new ticket(fiskePir);

        fiskePir.addTicket(pirTur2);

        System.out.println("Organizer balance: ");
        System.out.println(dnt.getOrganizerBalance());
        System.out.println("Movie balance: ");
        System.out.println(askim.getCinemaBalance());
        System.out.println("*****************");
        askim.sellTicket(martin,fiskePir, dnt,pirTur2);
        //askim.sellTicket(martin,nemo,askim,nemoTicket1);
        //askim.sellTicket(nemo, festiviteten);
        martin.addTicket(nemoTicket1,nemo);

        System.out.println("Organizer balance: ");
        System.out.println(dnt.getOrganizerBalance());
        System.out.println("Cinema balance: ");
        System.out.println(askim.getCinemaBalance());


        //USE-CASE: Administrere arrangement



        //USE-CASE: Registrere arrangør


        //USE-CASE: Kontroller billett

    }
}
