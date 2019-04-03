import java.util.Scanner;

public class visualiseringAvMain {

    public static void main(String[] args) {



        Scanner myObj = new Scanner(System.in);

        //int i = 0;
        //if (i < 10) {
        System.out.println("USECASE1 = Selgebillett");
        System.out.println("USECASE2 = Kjøpe billett");
        System.out.println("Skiv inn tallet på et av usecasene (1-7)");
        for (int i = 0; i < 20; i++) {


            String usecase1 = myObj.nextLine();
            int s = Integer.parseInt(usecase1);

            if (s == 1) {
                System.out.println("USECASE: Kansellere en billett");
                System.out.println("Vi tar imot parameterne billett og eventet som billetten tilhører.");

                //System.out.println("Kundens antall billetter før kanselering: " + kunde.getTickets().size());
                //kunde.cancelTicket(billett3, film2);
                //System.out.println("Kundens antall billetter etter kanselering: " + kunde.getTickets().size());
                System.out.println();
                System.out.println("Skiv inn tallet på et av usecasene (1-7)");
            }
            else if (s == 2) {
                System.out.println("Usecase " + s);
                System.out.println();
                System.out.println("USCASE1 = selgebillett");
                System.out.println("USCASE2 = kjøpe billett");
                System.out.println("Skiv inn tallet på et av usecasene (1-7)");
            }
            else if (s == 3) {
                System.out.println("Usecase " + s);
                System.out.println();
                System.out.println("USCASE1 = selgebillett");
                System.out.println("USCASE2 = kjøpe billett");
                System.out.println("Skiv inn tallet på et av usecasene (1-7)");
            }
            else if (s == 4) {
                System.out.println("Usecase " + s);
                System.out.println();
                System.out.println("Skiv inn tallet på et av usecasene (1-7)");
            }
            else if (s == 5) {
                System.out.println("Usecase " + s);
                System.out.println();
                System.out.println("Skiv inn tallet på et av usecasene (1-7)");
            }

            else {
                System.out.println("Du skrev inn et ygyldig usecasenummer!");
                System.out.println();
                System.out.println("Skiv inn tallet på et av usecasene (1-7)");
            }
            System.out.println();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println();
        }

    }
}
