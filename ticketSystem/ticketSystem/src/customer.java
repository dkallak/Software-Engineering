import java.util.ArrayList;
import java.util.LinkedList;

public class customer {

    private payment currentPayment;
    private String firstName;
    private String lastName;
    private int age;
    private ArrayList<ticket> tickets = new ArrayList<>();

    public customer(payment currentPayment, String firstName, String lastName, int age) {
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


    public payment getCurrentPayment() {
        return currentPayment;
    }

    public void setCurrentPayment(payment currentPayment) {
        this.currentPayment = currentPayment;
    }

    //Holder styr på hvilke billetter kunden har kjøpt
    public void addTicket(ticket ticket){
        tickets.add(ticket);
    }
}