class Director extends Employee {
    private double bonus;

    public Director(String firstName, String lastName, int phoneNumber, double salary, String position) {
        super(firstName, lastName, phoneNumber, salary, position);
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    void printInfo() {
        System.out.printf("Imię: %s; Nazwisko: %s; Numer telefonu: %d; Wynagrodzenie: %.2f; Stanowisko: %s; Premia:%.2f.\n", getFirstName(), getFirstName(), getPhoneNumber(), getSalary(), getPosition(), bonus);
    }
}

