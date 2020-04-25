class Customer extends Person {
    double paymentsTotal;

    Customer(String firstName, String lastName, int phoneNumber, double paymentsTotal) {
        super(firstName, lastName, phoneNumber);
        this.paymentsTotal = paymentsTotal;
    }
}
