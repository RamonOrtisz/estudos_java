package entities;

public class Product {

	public double width;
	public double height;
	
	public double area() {
		return width * height;
	}
	
	public double peri() {
		return 2 * (width + height);
	}
	
	public double diagon() {
		return Math.sqrt((width * width) + (height * height));
	}
	
}
