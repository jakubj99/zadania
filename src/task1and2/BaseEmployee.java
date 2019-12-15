package task1and2;

public class BaseEmployee extends CommisionEmployee {

    private double baseSalary;
    private double commisionRate;

    BaseEmployee(String firstName, String lastName, double grossSalary) {
        super(firstName, lastName, grossSalary);
    }


    private double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    private double getCommisionRate() {
        return commisionRate;
    }

    public void setCommisionRate(double commisionRate) {
        this.commisionRate = commisionRate;
    }

    @Override
    protected double earnings() {
        return getBaseSalary() + super.earnings();
    }
}