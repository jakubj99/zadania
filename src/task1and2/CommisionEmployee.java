package task1and2;

public class CommisionEmployee extends Employee {

    private double grossSalary;
    private double commisionRate;
    private double grossSales;


    CommisionEmployee(String firstName, String lastName, double grossSalary) {
        super(firstName, lastName);
        this.grossSalary = grossSalary;
    }

    private double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    private double getCommisionRate() {
        return commisionRate;
    }

    public void setCommisionRate(double commisionRate) {
        this.commisionRate = commisionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    @Override
    protected double earnings() {
        return getGrossSalary()*getCommisionRate();
    }

}
