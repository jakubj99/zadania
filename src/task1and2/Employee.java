package task1and2;

public abstract class Employee implements Payable {

    private final String firstName;
    private final String lastName;

    Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public double getPaymentAmount() {
        return earnings();
    }

    protected abstract double earnings();

}
