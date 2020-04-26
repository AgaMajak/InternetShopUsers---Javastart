package data;

public class Customer extends Person {

    double paymentsTotal;

    public Customer(String firstName, String lastName, int phoneNumber, double paymentsTotal) {
        super(firstName, lastName, phoneNumber);
        this.paymentsTotal = paymentsTotal;
    }

    public double getPaymentsTotal() {
        return paymentsTotal;
    }

    public void setPaymentsTotal(double paymentsTotal) {
        this.paymentsTotal = paymentsTotal;
    }

    @Override
    public void printInfo() {
        System.out.printf("Imię: %s; Nazwisko: %s; Numer telefonu: %d; Suma wydatków:%.2fzł.\n", getFirstName(), getLastName(), getPhoneNumber(), paymentsTotal);
    }
}
