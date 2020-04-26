package data;

public class Director extends Employee {
    double bonus;

    public Director(String firstName, String lastName, int phoneNumber, double salary, String position) {
        super(firstName, lastName, phoneNumber, salary, position);
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printInfo() {
        System.out.printf("Imię: %s; Nazwisko: %s; Numer telefonu: %d; Wynagrodzenie: %.2fzł; Stanowisko: %s; Premia: %.2fzł.\n", getFirstName(), getLastName(), getPhoneNumber(), salary, position, bonus);
        System.out.printf("Wynagrodzenie łącznie: %.2fzł\n", totalPayment());
    }

    public double totalPayment() {
        return salary + bonus;
    }

}

