import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;

public class customerTest {
    payment betaling = new payment("Geir", 222, 2,2,2,2000);
    cinema fredrikstadKino = new cinema("Nordisk Film", "Lars", "Hansen", "Fredsrikstad Kino", 1000000);
    event batman = new event("Batman Origins", LocalDate.of(2019, 02, 05), "Fredrikstad", 50, 50, fredrikstadKino, 200);
    customer geir = new customer("Geir", "Kirksæther", 39, betaling);
    ticket bilett1 = new ticket(batman, 20, 8, geir);

    @Test
    //Checks if the method adds ticket to list
    public void addTicketTest() {
        geir.addTicket(bilett1, batman);

        Assert.assertEquals(1, geir.getTickets().size());
    }


    @Test
    // Test for updating tickets remaining after selling, then cancel a ticket
    public void Tickets_Remaining_gets_updated() {

        int tickets_left = batman.getTicketsRemaining();

        fredrikstadKino.sellTicket(geir, batman, fredrikstadKino, bilett1);
        geir.cancelTicket(bilett1, batman);

        Assert.assertEquals(tickets_left, batman.getTicketsRemaining());
    }

    @Test
    public void Ticket_gets_removed_from_list_when_canceling() {

        int tickets_in_list = geir.getTickets().size();

        fredrikstadKino.sellTicket(geir, batman, fredrikstadKino, bilett1);
        geir.cancelTicket(bilett1, batman);

        Assert.assertEquals(tickets_in_list, geir.getTickets().size());
    }
}

