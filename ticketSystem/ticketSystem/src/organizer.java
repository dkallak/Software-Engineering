
import java.util.ArrayList;

public class organizer {

    private String company;
    private String referenceFirstname;
    private String referenceLastname;

    //Skal ikke være static fordi hver organizer har forskjellige lister over events som de eier
    private ArrayList<event> events = new ArrayList<>();


    public organizer(String company, String referenceFirstname, String referenceLastname) {
        this.company = company;
        this.referenceFirstname = referenceFirstname;
        this.referenceLastname = referenceLastname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getFirstName() {
        return referenceFirstname;
    }

    public void setFirstName(String referenceFirstname) {
        this.referenceFirstname = referenceFirstname;
    }

    public String getLastName() {
        return referenceLastname;
    }

    public void setLastName(String referenceLastname) {
        this.referenceLastname = referenceLastname;
    }

    public void addEvent(event event){
        events.add(event);
    }

    @Override
    public String toString(){
        return referenceFirstname + " " + referenceLastname + "\n" ;
    }
}
