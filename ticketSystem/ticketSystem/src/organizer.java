
import java.util.ArrayList;

public class organizer {

    private String firstName;
    private String lastName;

    //Skal ikke være static fordi hver organizer har forskjellige lister over events som de eier
    private ArrayList<event> events = new ArrayList<>();


    public organizer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public void addEvent(event event){
        events.add(event);
    }

    @Override
    public String toString(){
        return firstName + " " + lastName + "\n" ;
    }
}
