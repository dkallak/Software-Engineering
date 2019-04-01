import java.util.ArrayList;
import java.util.LinkedList;

public class customer {

    private payment currentPayment;
    private String firstName;
    private String lastName;
    private int age;
    private ArrayList<ticket> tickets = new ArrayList<ticket>();

    public customer(String firstName, String lastName, int age, payment currentPayment) {
        this.currentPayment = currentPayment;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<ticket> getTickets() {
        return tickets;
    }

    public payment getCurrentPayment() {
        return currentPayment;
    }

    public void setCurrentPayment(payment currentPayment) {
        this.currentPayment = currentPayment;
    }



    public void addTicket(ticket ticket, event event, payment payment){

        if (payment.getBalance() > event.getPrice()) {
            tickets.add(ticket);
            this.getCurrentPayment().setBalance(this.getCurrentPayment().getBalance() - event.getPrice());
        }
        else {
            System.out.println("Du har ikke dekning på kortet!");
        }
    }


    public void cancelTicket (ticket ticket, event event) {
        for (int i = 0; i < tickets.size(); i++) {
            if (tickets.get(i).getTicketID() == ticket.getTicketID()) {

                if (tickets.get(i).isValid() == true) {
                    event.setTicketsRemaining(event.getTicketsRemaining()+1);
                    this.getCurrentPayment().setBalance(this.getCurrentPayment().getBalance() + event.getPrice());

                    ticket.setValid(false);
                    tickets.remove(i);
                }
                else {
                    System.out.println("Beklager, det har skjedd en feil!");

                }
            }
        }
    }
}