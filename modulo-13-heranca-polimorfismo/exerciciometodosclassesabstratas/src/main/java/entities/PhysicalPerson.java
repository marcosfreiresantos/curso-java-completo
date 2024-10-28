package entities;

public class PhysicalPerson extends Person {

    private Double healthcareExpenses;

    public PhysicalPerson() {
    }

    public PhysicalPerson(String name, Double anualIncome, Double healthcareExpenses) {
        super(name, anualIncome);
        this.healthcareExpenses = healthcareExpenses;
    }

    public Double getHealthcareExpenses() {
        return healthcareExpenses;
    }

    public void setHealthcareExpenses(Double healthcareExpenses) {
        this.healthcareExpenses = healthcareExpenses;
    }

    @Override
    public double tax() {

        //double basicTax = (getHealthcareExpenses() < 20000.0) ? getAnualIncome() * 0.15 : getAnualIncome() * 0.25;

        double basicTax = 0.0;
        if (getAnualIncome() < 20000.00) {
            basicTax = getAnualIncome() * 0.15;
        } else {
            basicTax = getAnualIncome() * 0.25;
        }
        basicTax -= getHealthcareExpenses() * 0.50;
        if (basicTax < 0.0) {
            basicTax = 0.0;
        }
        return basicTax;
    }
}








