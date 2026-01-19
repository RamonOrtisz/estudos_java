package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter rectangle width and height: ");
		product.width = sc.nextDouble();
		product.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", product.area());
		System.out.printf("PERIMETER = %.2f%n", product.peri());
		System.out.printf("DIAGONAL = %.2f%n", product.diagon());

		sc.close();
	}

}
