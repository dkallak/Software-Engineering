import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        organizer arrangør = new organizer("Nordisk Film", "Jahn", "Svendsen", 20000);

        event film1 = new event("Film 1", LocalDate.of(2019,06,03), "Lokasjon 5", 5, 200, 200, arrangør, 150, true);

        event film2 = new event("Film 2", LocalDate.of(2019,05,13), "Lokasjon 8", 8, 150, 150, arrangør, 140, true);

        event film3 = new event("Film 3", LocalDate.of(2020,01,26), "Lokasjon 1", 1, 230, 230, arrangør, 180, true);


        System.out.println(event.getFilmList());


    }
}
