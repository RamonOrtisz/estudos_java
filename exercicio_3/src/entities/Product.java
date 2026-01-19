package entities;

import java.util.Scanner;

import application.Program;

public class Product {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Program program = new Program();
		
		System.out.print("name: ");
		program.name = sc.nextLine();
		
		System.out.println("Digite as 3 notas: ");
		program.n1 = sc.nextDouble();
		program.n2 = sc.nextDouble();
		program.n3 = sc.nextDouble();
		
		program.somaNotas();
		
		System.out.println("FINAL GRADE = " + program.somaNotas());

		program.logicaPass();
		
		sc.close();
	}



}
