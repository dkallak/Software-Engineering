import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;

public class customerTest {
    payment betaling = new payment("Geir", "5555444466668888", 2,2,2,2000);
    cinema fredrikstadKino = new cinema("Nordisk Film", "Lars", "Hansen", "Fredsrikstad Kino", 1000000);
    event batman = new event("Batman Origins", LocalDate.of(2019, 02, 05), "Fredrikstad", 50, 50, fredrikstadKino, 200, true);
    customer geir = new customer("Geir", "Kirksæther", 39, betaling);
    ticket billett1 = new ticket(batman, 20, 8, geir);


    @Test
    //Checks if the method adds ticket to list
    public void addTicketTest() {

        geir.addTicket(billett1, batman, betaling);

        Assert.assertEquals(1, geir.getTickets().size());
    }


    @Test
    public void doesBalanceUpdateWhenAddingATicket() {

        //Instansen av geirBalanse kjøper en billett (-200), samme som skjer i bakgrunn i addTicket()
        int geirBalanse = geir.getCurrentPayment().getBalance()-200;

        fredrikstadKino.sellTicket(geir,batman, fredrikstadKino, billett1, betaling);

        Assert.assertEquals(geirBalanse,geir.getCurrentPayment().getBalance());

    }

    @Test
    // Test for updating tickets remaining after selling, then cancel a ticket
    public void TicketsRemainingGetsUpdated() {

        int tickets_left = batman.getTicketsRemaining();

        fredrikstadKino.sellTicket(geir, batman, fredrikstadKino, billett1, betaling);
        geir.cancelTicket(billett1, batman);

        Assert.assertEquals(tickets_left, batman.getTicketsRemaining());
    }

    @Test
    public void TicketGetsRemovedFromListWhenCanceling() {

        int tickets_in_list = geir.getTickets().size();

        fredrikstadKino.sellTicket(geir, batman, fredrikstadKino, billett1, betaling);
        geir.cancelTicket(billett1, batman);

        Assert.assertEquals(tickets_in_list, geir.getTickets().size());
    }
}

