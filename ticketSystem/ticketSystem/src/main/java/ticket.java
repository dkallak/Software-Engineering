import java.time.LocalDate;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class ticket {

    private static final AtomicInteger teller = new AtomicInteger(1000);
    private final int ticketID;
    private customer ticketHolder;
    private int seatNumber;
    private int row;
    private boolean valid;
    private event ticketOfEvent;
    private static ArrayList<ticket> ticketlist = new ArrayList();


    public ticket(event etEvent, int seatNumber, int row, customer ticketHolder) {
        this.ticketOfEvent = etEvent;
        this.seatNumber = seatNumber;
        this.row = row;
        this.ticketHolder = ticketHolder;
        this.valid = false;
        this.ticketID = teller.incrementAndGet();
        ticketlist.add(this);
    }

    public ticket(event etEvent) {
        this.ticketOfEvent = etEvent;
        this.valid = false;
        this.ticketID = teller.incrementAndGet();
        ticketlist.add(this);
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public int getTicketID() {
        return ticketID;
    }

    public static ArrayList<ticket> getTicketlist() {
        return ticketlist;
    }

    public static void setTicketlist(ArrayList<ticket> ticketlist) {
        ticket.ticketlist = ticketlist;
    }



    @Override
    public String toString() {
        return "Navn: " + ticketOfEvent.getEventName() +
                "\nSetenummer: " + seatNumber +
                "\nRad: " + row +
                "\nBilletten er: " + valid +
                "\nID: " + ticketID;
    }

}