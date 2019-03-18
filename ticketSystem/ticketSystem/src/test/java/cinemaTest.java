import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class cinemaTest {

    organizer denNorskeTurforeningen = new organizer("Den norske turforeningen", "Henning", "Kvitnes");
    cinema askimKino = new cinema("Nordisk Film", "Robert", "Hansen", "Askim kino", 200000);
    event tripToNordby = new event("Tur til Nordby", LocalDate.of(2019,06,15), "Nordby", 70, 70, denNorskeTurforeningen, 90, false);
    ticket billett1Nordby = new ticket(tripToNordby);
    payment balanceOfJahn = new payment("Jahn Teigen", 4112, 2015, 2025, 123, 5000);
    customer jahnTeigen = new customer("Jahn", "Teigen", 69, balanceOfJahn);

    @Test
    public void setsTicketsRemaining () {

        askimKino.sellTicket(jahnTeigen, tripToNordby, denNorskeTurforeningen, billett1Nordby, balanceOfJahn);

        Assert.assertEquals(69, tripToNordby.getTicketsRemaining());
    }

    @Test
    public void isEventMovieEvent () {

        event avatar = new event("Avatar", LocalDate.of(2012, 06, 11), "Colluseum", 1, 500, 500, askimKino, 150, true);

        Assert.assertEquals(true, avatar.isMovieEvent());

    }

    @Test
    public void doesCinemaBalanceUpdateWhenSellingATicket () {

        event avatar = new event("Avatar", LocalDate.of(2012, 06, 11), "Colluseum", 1, 500, 500, askimKino, 150, true);
        ticket avatarTicket1 = new ticket(avatar, 16, 04, jahnTeigen);
        cinema askimKino = new cinema("Askim Kino", "Jarle", "Pedersen", "Askim Kino", 250000);

        askimKino.sellTicket(jahnTeigen, avatar, askimKino, avatarTicket1, balanceOfJahn);

        Assert.assertEquals(250150, askimKino.getCinemaBalance());

    }

    @Test
    public void doesCinemaBalanceGetFullCutWhenIsMovieIsTrue() {

        event avatar = new event("Avatar", LocalDate.of(2012, 06, 11), "Colluseum", 1, 500, 500, askimKino, 150, true);
        ticket avatarTicket1 = new ticket(avatar, 16, 04, jahnTeigen);
        cinema askimKino = new cinema("Askim Kino", "Jarle", "Pedersen", "Askim Kino", 250000);

        int ticketPrice = avatar.getPrice();
        int askimBalanse = askimKino.getCinemaBalance() + ticketPrice;

        askimKino.sellTicket(jahnTeigen, avatar, askimKino, avatarTicket1, balanceOfJahn);

        Assert.assertEquals(askimBalanse, askimKino.getCinemaBalance());
    }

    @Test
    public void doesCinemaBalanceUpdateWhenIsMovieIsFalse () {

        cinema askimKino = new cinema("Askim Kino", "Jarle", "Pedersen", "Askim Kino", 250000);

        int priceCut = tripToNordby.getPrice() * 20 / 100; // = 18
        int askimBalanse = askimKino.getCinemaBalance() + priceCut; // 250000 + 18 = 250018

        askimKino.sellTicket(jahnTeigen, tripToNordby, askimKino, billett1Nordby, balanceOfJahn);

        Assert.assertEquals(askimBalanse, askimKino.getCinemaBalance());

    }

}

