import java.time.LocalDate;
import java.util.ArrayList;


public class usedTickets extends ticket {

    ArrayList<ticket> brukteBilletter = new ArrayList();
    public usedTickets(String eventName, LocalDate date, String location, int price, int seatNumber, int row) {
        super(eventName, date, location, price, seatNumber, row);
        brukteBilletter.add(this);
    }
}

