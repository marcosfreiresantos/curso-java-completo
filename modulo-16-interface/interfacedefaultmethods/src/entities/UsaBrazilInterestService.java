package entities;

import java.security.InvalidParameterException;

public class UsaBrazilInterestService implements InterestService {

    private double interestRate;

    public UsaBrazilInterestService() {
    }

    public UsaBrazilInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }
}
