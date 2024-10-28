package entities;

public class Company extends TaxPayer {

	private Integer quantityEmployees;
	
	public Company() {		
	}

	public Company(String name, Double anualincome, Integer quantityEmployees) {
		super(name, anualincome);
		this.quantityEmployees = quantityEmployees;
	}
	
	public Integer getQuantityEmployees() {
		return quantityEmployees;
	}
	
	public void setQuantityEmployess(Integer quantityEmployees) {
		this.quantityEmployees = quantityEmployees;
	}
	
	@Override
	public Double tax(){
		if (quantityEmployees > 10) {
			return getAnualIncome() * 0.14;
		}
		else {
			return getAnualIncome() * 0.16;
		}
	}
}
