package task1and2;

public class SalariedEmployee extends Employee {

    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, double weeklySalary) {
        super(firstName, lastName);
        this.weeklySalary = weeklySalary;
    }

    protected SalariedEmployee(String firstName, String lastName) {
        super(firstName, lastName);
    }

    private double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    protected double earnings() {
        return getWeeklySalary();
    }

}
