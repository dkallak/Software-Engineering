public class cinema extends organizer{

    private String cinemaName;

    public cinema(String cinemaName, String company, String referenceFirstname, String referenceLastname, int organizerBalance) {
        super(company, referenceFirstname, referenceLastname, organizerBalance);
        this.cinemaName = cinemaName;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }



    public void sellTicket (customer customer, event event, organizer organizer, ticket ticket, payment payment) {

        customer.addTicket(ticket, event, payment);
        customer.getCurrentPayment().setBalance(customer.getCurrentPayment().getBalance() - event.getPrice());

        ticket.setValid(true);

        if (event.isMovieEvent() == true) {
            this.setOrganizerBalance(this.getOrganizerBalance() + event.getPrice());

        }

        else if (event.isMovieEvent() == false) {
            organizer.setOrganizerBalance(organizer.getOrganizerBalance() + (event.getPrice() * 80 / 100));
            this.setOrganizerBalance(this.getOrganizerBalance() + (event.getPrice() * 20 / 100));
        }
    }

}
