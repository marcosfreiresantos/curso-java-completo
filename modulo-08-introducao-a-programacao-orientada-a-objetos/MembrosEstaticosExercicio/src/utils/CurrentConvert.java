package utils;

public class CurrentConvert {
	
	public static final double IOF = 6.0;
	
	public static double calcDollar(double priceDollar, double qts_dollar) {
		double valor = priceDollar * qts_dollar;
		return valor += (valor * IOF) / 100;
				
	}
	
}
