public class payment extends customer{

    private customer cardName;
    private int cardNumber;
    private int validFrom;
    private int validTo;
    private int CVC2;
    private int balance;

    public payment(String firstName, String lastName, int age, int cardNumber, int validFrom, int validTo, int CVC2, int balance) {
        super(firstName, lastName, age);
        this.cardNumber = cardNumber;
        this.validFrom = validFrom;
        this.validTo = validTo;
        this.CVC2 = CVC2;
        this.balance = balance;
    }

    public payment(String firstName, String lastName, int age, customer cardName, int cardNumber, int validFrom, int validTo, int CVC2, int balance) {
        super(firstName, lastName, age);
        this.cardName = cardName;
        this.cardNumber = cardNumber;
        this.validFrom = validFrom;
        this.validTo = validTo;
        this.CVC2 = CVC2;
        this.balance = balance;
    }

    public customer getCardName() {
        return cardName;
    }

    public void setCardName(customer cardName) {
        this.cardName = cardName;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(int validFrom) {
        this.validFrom = validFrom;
    }

    public int getValidTo() {
        return validTo;
    }

    public void setValidTo(int validTo) {
        this.validTo = validTo;
    }

    public int getCVC2() {
        return CVC2;
    }

    public void setCVC2(int CVC2) {
        this.CVC2 = CVC2;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public static String checkBalance (int ticketprice, int accountbalance) {

        if (ticketprice >  accountbalance) {
            return "Du har ikke dekning på kortet";
        }
        else {
            accountbalance = accountbalance - ticketprice;
            return "Gratulerer med kjøpet av billett"+
                    "\nDu har nå " + accountbalance + " kroner igjen på kortet";
        }
    }

    @Override
    public String toString() {
        return "Navn: " + super.getFirstName() + " " + super.getLastName() +
                "\nAlder: " + super.getAge() +
                "\nKortnummer: " + cardNumber +
                "\nGyldig fra: " + validFrom +
                "\nGyldig til: " + validTo +
                "\nDu må fornye kortet om: " + (validTo-validFrom) + " år" +
                "\nOg nummeret du ikke må gi til John er: " + CVC2 +
                "\nSaldoen på kontoen din er: " + balance;
    }
}