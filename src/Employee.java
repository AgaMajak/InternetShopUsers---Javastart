class Employee extends Person {
    private final double salary;
    private final String position;

    Employee(String firstName, String lastName, int phoneNumber, double salary, String position) {
        super(firstName, lastName, phoneNumber);
        this.salary = salary;
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    void printInfo() {
        System.out.printf("Imię: %s; Nazwisko: %s; Numer telefonu: %d; Wynagrodzenie: %.2f; Stanowisko: %s.\n", getFirstName(), getFirstName(), getPhoneNumber(), salary, position);
    }

}
