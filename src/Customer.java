class Customer extends Person {
    private final double paymentsTotal;

    Customer(String firstName, String lastName, int phoneNumber, double paymentsTotal) {
        super(firstName, lastName, phoneNumber);
        this.paymentsTotal = paymentsTotal;
    }

    @Override
    void printInfo() {
        System.out.printf("Imię: %s; Nazwisko: %s; Numer telefonu: %d; Suma wydatków:%.2f.\n", getFirstName(), getLastName(), getPhoneNumber(), paymentsTotal);
    }
}
