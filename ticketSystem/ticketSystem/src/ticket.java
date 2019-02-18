import java.time.LocalDate;

public class ticket extends event {

    private int seatNumber;
    private int row;
    private boolean valid;

    public ticket(String eventName, LocalDate date, String location, int seatNumber, int row) {
        super(eventName, date, location);
        this.seatNumber = seatNumber;
        this.row = row;
        this.valid = true;
    }

    public ticket(String eventName, LocalDate date, String location) {
        super(eventName, date, location);
        this.valid = true;
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

    @Override
    public String toString() {
        return "Navn: " + super.getEventName() + "\n" + "Setenummer: " + seatNumber + "\n" + "Rad: " + row + "\nBilletten er: " + valid;
    }
}