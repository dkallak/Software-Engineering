import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class paymentTest {

    @Test
    public void doesBalanceChange() {
        // Checks wether the customer does have enough money to pay for a ticket.
        // If he does, he will buy the ticket. If not, he won't be able to buy it
        
        organizer denNorskeTurforeningen = new organizer("Den norske turforeningen", "Henning", "Kvitnes");
        event tripToNordby = new event("Tur til Nordby", LocalDate.of(2019,06,15), "Nordby", 70, 70, denNorskeTurforeningen, 90, false);
        ticket billett1Nordby = new ticket(tripToNordby);
        payment balanceOfJahn = new payment("Jahn Teigen", 4112, 2015, 2025, 123, 5000);
        customer jahnTeigen = new customer("Jahn", "Teigen", 69, balanceOfJahn);

        jahnTeigen.addTicket(billett1Nordby, tripToNordby, balanceOfJahn);


        Assert.assertEquals(4910, jahnTeigen.getCurrentPayment().getBalance());
    }

}
