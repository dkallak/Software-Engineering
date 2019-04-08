import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("USECASE: Sjekke utvalg blant arrangementer");
        System.out.println("Her skrives ut alle arrangementer som er tilgjengelig.");
        System.out.println("Vi kan også skrive ut kun kinofilmer eller kun andre eventer, slik man ser under i koden som er kommentert ut");

        organizer arrangor = new organizer("Nordisk Film", "Jahn", "Svendsen", 200000);

        event film1 = new event("Film 1", LocalDate.of(2019,6,3), "Lokasjon 5", 5, 200, 200, arrangor, 100, true);

        event film2 = new event("Film 2", LocalDate.of(2019,5,13), "Lokasjon 8", 8, 150, 150, arrangor, 100, true);

        event film3 = new event("Film 3", LocalDate.of(2020,1,26), "Lokasjon 1", 1, 230, 230, arrangor, 180, true);

        event arrangement2 = new event("Arrangement 1", LocalDate.of(2019,11,10), "Lokasjon 7", 70, 70, arrangor, 100, false);

        event arrangement3 = new event("Arrangement 2", LocalDate.of(2021,8,7), "Lokasjon 6", 90, 90, arrangor, 100, false);

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

        ticket billett3 = new ticket(film2, 3, 8, kunde);

        ticket billett4 = new ticket(arrangement3, 1, 9, kunde);

        kunde.addTicket(billett1, film1, betaling);

        kunde.addTicket(billett2, arrangement2, betaling);

        System.out.println("Her legger vi til billetter i kundens billettoversikt.");
        System.out.println("Vi har lagt til to billetter som koden under viser til");
        System.out.println("Antall billetter kunden har: " + kunde.getTickets().size());

        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");

        System.out.println("USECASE: Selge billett");
        System.out.println("Når vi selger en billett, tar vi imot flere parametere, ");
        System.out.println("slik at den også tilfredsstiller addTicket-metoden som ligger inne i sellTicket.");

        cinema kino = new cinema("Kino", "Nordisk Film" , "Navn", "Navnesen", 200000);

        //kino.sellTicket(kunde, film1, kino, billett1, betaling);
        kino.sellTicket(kunde, arrangement3, arrangor, billett4, betaling);


        kino.sellTicket(kunde, film2, kino, billett3, betaling);
        //kino.sellTicket(kunde, arrangement2, arrangor, billett3, betaling);

        System.out.println("Viser til at kundens balanse endrer seg ved kjøp av en billett, og antall billetter tilgjenglige reduseres.");
        System.out.println("Billetter som er igjen er nå: " + arrangement2.getTicketsRemaining());
        System.out.println("Balansen til arrangøren: " + arrangor.getOrganizerBalance());
        System.out.println("Balansen til kinoen: " + kino.getOrganizerBalance());
        System.out.println("Kundens saldo etter den har kjøpt en billett: " + kunde.getCurrentPayment().getBalance());

        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");

        System.out.println("USECASE: Kansellere en billett");
        System.out.println("Vi tar imot parameterne billett og eventet som billetten tilhører.");

        System.out.println("Kundens antall billetter før kanselering: " + kunde.getTickets().size());
        kunde.cancelTicket(billett3, film2);
        System.out.println("Kundens antall billetter etter kanselering: " + kunde.getTickets().size());

        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");

        System.out.println("USECASE: Sjekker om en billett er gyldig ");
        System.out.println("Den første billetten er kansellert, og dermed ikke gyldig");
        System.out.println(film2.checkValid(billett3));
        System.out.println("Denne billetten er solgt, så er fortsatt gyldig");
        System.out.println(arrangement3.checkValid(billett4));

        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");

        System.out.println("USECASE: Registrere arrangør");
        System.out.println("Her registrerer vi arrangører, altså oppretter objekter av klassen organizer");
        organizer organisor = new organizer("Company1", "Fornavn1", "Etternavn1", 200000);
        System.out.println(organisor);

        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");

        System.out.println("USECASE: Administrere arrangement");
        System.out.println("Her endrer vi elementer av et arrangement");
        System.out.println(film2.getEventName());
        System.out.println(film2.getDate());
        film2.setDate(LocalDate.of(2019, 07, 13));
        film2.setEventName("Film to");
        System.out.println(film2.getEventName());
        System.out.println(film2.getDate());

        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");

        Scanner myObj = new Scanner(System.in);

        System.out.println("USECASE1 = Selgebillett");
        System.out.println("USECASE2 = Kjøpe billett");
        System.out.println("Skiv inn tallet på et av usecasene (1-7)");
        for (int i = 0; i < 20; i++) {

            String usecase1 = myObj.nextLine();


            try{
                int s = Integer.parseInt(usecase1);

                if (s == 1) {
                    System.out.println("USECASE: Kansellere en billett");
                    System.out.println("Vi tar imot parameterne billett og eventet som billetten tilhører.");

                    System.out.println("Kundens antall billetter før kanselering: " + kunde.getTickets().size());
                    kunde.cancelTicket(billett3, film2);
                    System.out.println("Kundens antall billetter etter kanselering: " + kunde.getTickets().size());
                    System.out.println();
                    System.out.println("Skiv inn tallet på et av usecasene (1-7)");
                }
                else if (s == 2) {
                    System.out.println("Usecase " + s);
                    System.out.println();
                    System.out.println("USCASE1 = selgebillett");
                    System.out.println("USCASE2 = kjøpe billett");
                    System.out.println("Skiv inn tallet på et av usecasene (1-7)");
                }
                else if (s == 3) {
                    System.out.println("Usecase " + s);
                    System.out.println();
                    System.out.println("USCASE1 = selgebillett");
                    System.out.println("USCASE2 = kjøpe billett");
                    System.out.println("Skiv inn tallet på et av usecasene (1-7)");
                }
                else if (s == 4) {
                    System.out.println("Usecase " + s);
                    System.out.println();
                    System.out.println("Skiv inn tallet på et av usecasene (1-7)");
                }
                else if (s == 5) {
                    System.out.println("Usecase " + s);
                    System.out.println();
                    System.out.println("Skiv inn tallet på et av usecasene (1-7)");
                }

                else {
                    System.out.println("Du skrev inn et ugyldig usecasenummer!");
                    System.out.println();
                    System.out.println("Skiv inn tallet på et av usecasene (1-7)");
                }
                System.out.println();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println();

                }
            catch(NumberFormatException ex) {
                System.out.println("Skriv inn en gyldig tallverdi");
            }
        }

    }
}