import java.util.ArrayList;
import java.util.LinkedList;

public class customer {

    private payment currentPayment;
    private String firstName;
    private String lastName;
    private int age;
    private ArrayList<ticket> tickets = new ArrayList<>();

    public customer(String firstName, String lastName, int age, payment currentPayment) {
        this.currentPayment = currentPayment;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public customer(String firstName, String lastName, int age) {
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


    //Metode for kjøp av billett, gir kunden eierskap til billetten. Reduserer billettantallet
    public void addTicket(ticket ticket, event event, customer customer){

        event.setTicketsRemaining(event.getTicketsRemaining()-1);

        tickets.add(ticket);
        customer.getCurrentPayment().setBalance(customer.getCurrentPayment().getBalance() - event.getPrice());
    }


    //Metode for kansellering av billett. Øker billettantallet
    public void cancelTicket (ticket ticket, event event, customer customer) {

        event.setTicketsRemaining(event.getTicketsRemaining()+1);
        for (int i = 0; i < tickets.size(); i++) {
        //event.getEventList().get(i).getEventName()
            if (tickets.get(i).getTicketID() == ticket.getTicketID()) {

                if (tickets.get(i).isValid() == true) {
                    customer.getCurrentPayment().setBalance(customer.getCurrentPayment().getBalance() + event.getPrice());
                }
                else {
                    customer.getCurrentPayment().setBalance(customer.getCurrentPayment().getBalance());

                }
                tickets.remove(i);
            }
        }
    }
}