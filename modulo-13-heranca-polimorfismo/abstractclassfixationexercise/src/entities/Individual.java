package entities;

public class Individual extends TaxPayer {

	private Double healthSpending;

	public Individual() {
	}

	public Individual(String name, Double anualIncome, Double healthSpending) {
		super(name, anualIncome);
		this.healthSpending = healthSpending;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	@Override
	public Double tax() {
		
		//double basicTax = (getAnualIncome() < 20000.0) ? getAnualIncome() * 0.15 : getAnualIncome() * 0.25;
		
		double basicTax;
		if (getAnualIncome() < 20000.0) {
			basicTax = getAnualIncome() * 0.15;
		}
		else {
			basicTax = getAnualIncome() * 0.25;
		}
		basicTax -= getHealthSpending() * 0.5;
		if (basicTax < 0.0) {
			basicTax = 0.0;
		}		
		return basicTax;		
	}
}
