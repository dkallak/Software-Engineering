import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        organizer visitFredrikstad = new organizer("Lise","Lotte");
        event glommaFestivalen = new event ("Glommafestivalen", LocalDate.of(2019,06,15),"Fredrikstad",15000,15000,visitFredrikstad);
        //event glommaFestivalen2 = new event ("Glommafestivalen", LocalDate.of(2019,06,15),"Fredrikstad",15000,15000,visitFredrikstad);
        //event glommaFestivalen3 = new event ("Glommafestivalen", LocalDate.of(2019,06,15),"Fredrikstad",15000,15000,visitFredrikstad);

        ticket movieTicket = new ticket(glommaFestivalen,LocalDate.of(2019, 04, 15),"Fredrikstad",15,8);

        
        System.out.println(movieTicket);

    }
}
