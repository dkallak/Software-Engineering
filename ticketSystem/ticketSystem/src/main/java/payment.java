public class payment {

    private String cardholder;
    private int cardNumber;
    private int validFrom;
    private int validTo;
    private int CVC2;
    private int balance;


    public payment(String cardholder, int cardNumber, int validFrom, int validTo, int CVC2, int balance) {
        this.cardholder = cardholder;
        this.cardNumber = cardNumber;
        this.validFrom = validFrom;
        this.validTo = validTo;
        this.CVC2 = CVC2;
        this.balance = balance;
    }

    public String getCardholder() {
        return cardholder;
    }

    public void setCardholder(String cardholder) {
        this.cardholder = cardholder;
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

    @Override
    public String toString() {
        return "Navn: " + cardNumber +
                "\nAlder: mystisk" +
                "\nKortnummer: " + cardNumber +
                "\nGyldig fra: " + validFrom +
                "\nGyldig til: " + validTo +
                "\nDu må fornye kortet om: " + (validTo-validFrom) + " år" +
                "\nOg CVC2 nummeret er: " + CVC2 +
                "\nSaldoen på kontoen din er: " + balance;
    }
}