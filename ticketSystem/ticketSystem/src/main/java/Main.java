import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        System.out.println("USECASE: Sjekke utvalg blant arrangementer");
        System.out.println("Her skrives ut alle arrangementer som er tilgjengelig.");
        System.out.println("Vi kan også skrive ut kun kinofilmer eller kun andre eventer, slik man ser under i koden som er kommentert ut");

        organizer arrangor = new organizer("Nordisk Film", "Jahn", "Svendsen", 200000);

        event film1 = new event("Film 1", LocalDate.of(2019,6,3), "Lokasjon 5", 5, 200, 200, arrangor, 100, true);

        event film2 = new event("Film 2", LocalDate.of(2019,5,13), "Lokasjon 8", 8, 150, 150, arrangor, 100, true);

        event film3 = new event("Film 3", LocalDate.of(2020,1,26), "Lokasjon 1", 1, 230, 230, arrangor, 180, true);

        event arrangement1 = new event("Arrangement 1", LocalDate.of(2019,11,10), "Lokasjon 7", 70, 70, arrangor, 100, false);

        event arrangement2 = new event("Arrangement 2", LocalDate.of(2021,8,7), "Lokasjon 6", 90, 90, arrangor, 100, false);

        System.out.println(event.getAllEvents());
        //System.out.println(event.getFilmList());
        //System.out.println(event.getOtherEvents());

        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");

        System.out.println("USECASE: Kunde kjøper billett");
        System.out.println("Vi har metoden addTicket inne i metoden sellTicket, men for visningens skyld, ");
        System.out.println("har vi trukket den ut for å visualisere usecaset; kjøp billett");
        payment betaling = new payment("Ola Nordmann", "4994984641041158", 2015, 2022, 456, 800);

        customer kunde = new customer("Kunde", "Kundesen", 29, betaling);

        ticket billett1 = new ticket(film1, 18, 4, kunde);

        ticket billett2 = new ticket(arrangement2, 5, 6, kunde);

        ticket billett3 = new ticket(arrangement2, 5, 6, kunde);

        kunde.addTicket(billett1, film1, betaling);

        kunde.addTicket(billett2, arrangement2, betaling);

        System.out.println("Her legger vi til billetter i kundens billettoversikt");
        System.out.println("Vi har lagt til to billetter som koden under viser til");
        System.out.println("Antall billetter kunden har: " + kunde.getTickets().size());

        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");

        System.out.println("USECASE: Selge billett");

        cinema kino = new cinema("Kino", "Nordisk Film" , "Navn", "Navnesen", 200000);

        //kino.sellTicket(kunde, film1, kino, billett1, betaling);
        kino.sellTicket(kunde, arrangement2, arrangor, billett2, betaling);


        kino.sellTicket(kunde, film1, kino, billett1, betaling);
        //kino.sellTicket(kunde, arrangement2, arrangor, billett3, betaling);

        System.out.println("Viser til at kundens balanse endrer seg ved kjøp av en billett, og antall billetter tilgjenglige reduseres.");
        System.out.println("Billetter som er igjen er nå: " + arrangement2.getTicketsRemaining());
        System.out.println("Balansen til arrangøren: " + arrangor.getOrganizerBalance());
        System.out.println("Balansen til kinoen: " + kino.getOrganizerBalance());
        System.out.println("Kundens saldo etter den har kjøpt en billett: " + kunde.getCurrentPayment().getBalance());

    }
}
