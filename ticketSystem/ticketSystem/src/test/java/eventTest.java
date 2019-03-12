import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class eventTest {

    organizer studentParlamentet = new organizer("Studentparlamentet");

    event tripToIbiza = new event("Trip to Ibiza", LocalDate.of(2019, 06, 12), "Ibiza", 400, 400, studentParlamentet, 3400);

    cinema drammenKino = new cinema("Nordic films", "Kjell", "Eriksen", "Drammen Kino", 300000);

    payment magnePayment = new payment("Magne Samuelsen", 7111, 2017, 2016, 566, 4400);

    customer magne = new customer("Magne", "Samuelsen",52, magnePayment);

    ticket ibizaTicket1 = new ticket(tripToIbiza, 2, 14, magne);

    @Test
    public void showValidTickets() {

        tripToIbiza.addTicketToTicketlist(ibizaTicket1);

        Assert.assertEquals(tripToIbiza.getValidTickets().size(), 1);
    }

    @Test
    public void isTicketAddedToTicketlist() {

        tripToIbiza.addTicketToTicketlist(ibizaTicket1);

        Assert.assertEquals(tripToIbiza.getTickets().size(), 1);
    }


    @Test
    public void isTicketValid() {

        tripToIbiza.addTicketToTicketlist(ibizaTicket1);

        Assert.assertEquals(tripToIbiza.checkValid(ibizaTicket1), true);
    }
}

