package entities;

public class LegalPerson extends Person {

    private Integer quantityOfEmployee;

    public LegalPerson() {
    }

    public LegalPerson(String name, Double anualIncome, Integer quantityOfEmployee) {
        super(name, anualIncome);
        this.quantityOfEmployee = quantityOfEmployee;
    }

    public Integer getQuantityOfEmployee() {
        return quantityOfEmployee;
    }

    public void setQuantityEmployee(Integer quantityOfEmployee) {
        this.quantityOfEmployee = quantityOfEmployee;
    }

    @Override
    public double tax() {
        if (quantityOfEmployee < 10) {
            return anualIncome * 0.16;
        } else {
            return anualIncome * 0.14;
        }
    }
}
