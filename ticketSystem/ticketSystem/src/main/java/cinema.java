public class cinema extends organizer{


    private String cinemaName;
    private int cinemaBalance;

    public cinema(String company, String referenceFirstname, String referenceLastname,String cinemaName, int cinemaBalance) {
        super(company, referenceFirstname, referenceLastname);
        this.cinemaName = cinemaName;
        this.cinemaBalance = cinemaBalance;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public int getCinemaBalance() {
        return cinemaBalance;
    }

    public void setCinemaBalance(int cinemaBalance) {
        this.cinemaBalance = cinemaBalance;
    }

    public void sellTicket (customer customer, event event, organizer organizer, ticket ticket, payment payment) {

        customer.addTicket(ticket,event, payment);

        event.setTicketsRemaining(event.getTicketsRemaining()-1);

        if (event.isMovieEvent() == true) {
            this.setCinemaBalance(this.getCinemaBalance() + event.getPrice());

        }
        
        else if (event.isMovieEvent() == false) {

            organizer.setOrganizerBalance(organizer.getOrganizerBalance() + (event.getPrice() * 80 / 100));
            this.setCinemaBalance(this.getCinemaBalance() + (event.getPrice() * 20 / 100));
        }
    }

}
