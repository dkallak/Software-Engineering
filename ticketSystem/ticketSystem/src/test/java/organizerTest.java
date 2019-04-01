import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class organizerTest {

    @Test
    public void doesEventGetsAddedToEventList() {

        organizer denNorskeTurforeningen = new organizer("Den norske turforeningen", "Henning", "Kvitnes", 1000);
        event tripToNordby = new event("Tur til Nordby", LocalDate.of(2019,06,15), "Nordby", 70, 70, denNorskeTurforeningen, 90, false);
        ticket billett1Nordby = new ticket(tripToNordby);
        payment balanceOfJahn = new payment("Jahn Teigen", 4112, 2015, 2025, 123, 5000);
        customer jahnTeigen = new customer("Jahn", "Teigen", 69, balanceOfJahn);

        denNorskeTurforeningen.addEvent(tripToNordby);

        Assert.assertEquals(1, denNorskeTurforeningen.getEvents().size());
    }

}
