class Person {
    private final String firstName;
    private final String lastName;
    private final int phoneNumber;

    Person(String firstName, String lastName, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    void printInfo() {
        System.out.printf("Imię: %s; Nazwisko: %s; Numer telefonu: %d.\n", firstName, lastName, phoneNumber);
    }

}
