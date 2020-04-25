class Employee extends Person {
    double salary;
    String position;

    Employee(String firstName, String lastName, int phoneNumber, double salary, String position) {
        super(firstName, lastName, phoneNumber);
        this.salary = salary;
        this.position = position;
    }
}
