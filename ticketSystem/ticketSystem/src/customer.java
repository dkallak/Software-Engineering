public class customer {

    private String firstName;
    private String lastName;
    private int age;

    public customer(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}

    private class payment {

        private String cardName;
        private int cardNumber;
        private int validFrom;
        private int validTo;
        private int CVC2;

        public payment(String cardName, int cardNumber, int validFrom, int validTo, int CVC2) {
            this.cardName = cardName;
            this.cardNumber = cardNumber;
            this.validFrom = validFrom;
            this.validTo = validTo;
            this.CVC2 = CVC2;
        }
    }


}
