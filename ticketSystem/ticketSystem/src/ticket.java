import java.time.LocalDate;

public class ticket extends event {

    private int seatNumber;
    private int row;

    public ticket(event eventName, LocalDate date, String location, int seatNumber, int row) {
        super(eventName, date, location);
        this.seatNumber = seatNumber;
        this.row = row;
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

    @Override
    public String toString() {
        return "Navn: " + eventName + "\n" + "Setenummer " + seatNumber + "\n" + "Rad: " + row + "\n" ;
    }
}