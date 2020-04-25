package data;

public class Employee extends Person {
    protected double salary;
    protected String position;

    public Employee(String firstName, String lastName, int phoneNumber, double salary, String position) {
        super(firstName, lastName, phoneNumber);
        this.salary = salary;
        this.position = position;
    }

    @Override
    public void printInfo() {
        System.out.printf("Imię: %s; Nazwisko: %s; Numer telefonu: %d; Wynagrodzenie: %.2fzł; Stanowisko: %s.\n", getFirstName(), getFirstName(), getPhoneNumber(), salary, position);
    }

}
