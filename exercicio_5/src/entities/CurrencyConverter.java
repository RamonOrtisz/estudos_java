package entities;

public class CurrencyConverter {

	private double price;
	private double bought;
	
	public CurrencyConverter(double price, double bought) {
		this.price = price;
		this.bought = bought;
	}
	
	public double convertValue() {
		return price * bought;
	}
	public double taxValue() {
		return convertValue() * 0.06;
	}
	public double totalValue() {
		return convertValue() + taxValue();
 	}
}
