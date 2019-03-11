import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
public class billettTest {


    @Test
    public void erCustomerGammelNok() {

        customer martin = new customer("Martin", "Heian", 18);

        int ageLimit = 18;
        boolean alderSjekk = ageLimit <= martin.getAge();

        Assert.assertEquals(alderSjekk, true);
    }

    @Test
    public void addTicket() {

        organizer torarne = new organizer("Tor Arne AS", "Tor Arne", "Moxheim");

        event pirtur = new event("Pirtur", LocalDate.of(2019,2,2),"Drammen",200,200,torarne,50);

        ticket pirturBillett = new ticket(pirtur);
        ticket pirturBillett1 = new ticket(pirtur);

        customer martin = new customer("Martin", "Heian", 22);

        pirtur.addTicketToTicketlist(pirturBillett);
        pirtur.addTicketToTicketlist(pirturBillett1);

        Assert.assertEquals(2, ticket.getTicketlist().size());

    }

    @Test
    public void removeTicketFromTicketsAvailable() {


        organizer torarne = new organizer("Tor Arne AS", "Tor Arne", "Moxheim");

        event pirtur = new event("Pirtur", LocalDate.of(2019,2,2),"Drammen",200,200,torarne,50);

        ticket pirturBillett = new ticket(pirtur);

        payment betaling = new payment("Martin",2,2,2,2,2000);

        customer martin = new customer("Martin", "Heian", 22, betaling);

        cinema askimKino = new cinema("Askim Kino", "Han som kler seg ut som Elvis","Presley","Askim Kino",200000);

        martin.addTicket(pirturBillett,pirtur);

        pirtur.addTicketToTicketlist(pirturBillett);

        askimKino.sellTicket(martin,pirtur,torarne,pirturBillett);

        Assert.assertEquals(pirtur.getTicketsRemaining(), pirtur.getTicketsRemaining());
    }


}