public class payment extends customer{

    private customer cardName;
    private int cardNumber;
    private int validFrom;
    private int validTo;
    private int CVC2;

    public payment(String firstName, String lastName, int age, int cardNumber, int validFrom, int validTo, int CVC2) {
        super(firstName, lastName, age);
        this.cardNumber = cardNumber;
        this.validFrom = validFrom;
        this.validTo = validTo;
        this.CVC2 = CVC2;
    }

    @Override
    public String toString() {
        return "Navn: " + super.getFirstName() + " " + super.getLastName() +
                "\nAlder: " + super.getAge() +
                "\nKortnummer: " + cardNumber +
                "\nGyldig fra: " + validFrom +
                "\nGyldig til: " + validTo +
                "\nDu må fornye kortet om: " + (validTo-validFrom) + " år" +
                "\nOg nummeret du ikke må gi til fremmede er: " + CVC2;
    }
}
