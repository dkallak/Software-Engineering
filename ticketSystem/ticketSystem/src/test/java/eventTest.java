import org.junit.Assert;
import org.junit.Test;


import java.time.LocalDate;

public class eventTest {


    organizer studentParlamentet = new organizer("Studentparlamentet", "Fornavn", "Etternavn", 32903);
    event tripToIbiza = new event("Trip to Ibiza", LocalDate.of(2019, 06, 12), "Ibiza", 400, 400, studentParlamentet, 3400, false);
    cinema drammenKino = new cinema("Nordic films", "Kjell", "Eriksen", "Drammen Kino", 300000);
    payment magnePayment = new payment("Magne Samuelsen", "7111", 2017, 2016, 566, 4400);
    customer magne = new customer("Magne", "Samuelsen", 52, magnePayment);
    ticket ibizaTicket1 = new ticket(tripToIbiza, 2, 14, magne);


    
    @Test
    public void isTicketAddedToTicketlist() {

        tripToIbiza.addTicketToTicketlist(ibizaTicket1);

        Assert.assertEquals(1, tripToIbiza.getTicketsForEvent().size());
    }


    @Test
    public void isTicketValid() {

        tripToIbiza.addTicketToTicketlist(ibizaTicket1);
        drammenKino.sellTicket(magne, tripToIbiza, studentParlamentet, ibizaTicket1, magnePayment);

        Assert.assertEquals(true, tripToIbiza.checkValid(ibizaTicket1));
    }
}

