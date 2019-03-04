
import java.util.ArrayList;

public class organizer {

    private String company;
    private String referenceFirstname;
    private String referenceLastname;
    private int organizerBalance;
    private int cinemaBalance;

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

    public int getOrganizerBalance() {
        return organizerBalance;
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

    public void setOrganizerBalance(int organizerBalance) {
        this.organizerBalance = organizerBalance;
    }

    public int getCinemaBalance() {
        return cinemaBalance;
    }

    public void setCinemaBalance(int cinemaBalance) {
        this.cinemaBalance = cinemaBalance;
    }

    public void addEvent(event event){
        events.add(event);
    }

    public void sellTicket (event event) {


        event.setTicketsRemaining(event.getTicketsRemaining()-1);

        if (event.isMovieEvent() == true) {
            this.setCinemaBalance(this.getCinemaBalance() + event.getPrice());

        }
        else if (event.isMovieEvent() == false) {

            this.setOrganizerBalance(this.getOrganizerBalance() + (event.getPrice() * 80 / 100));
            this.setCinemaBalance(this.getCinemaBalance() + (event.getPrice() * 20 / 100));
        }
    }

    @Override
    public String toString(){
        return referenceFirstname + " " + referenceLastname + "\n" ;
    }
}
