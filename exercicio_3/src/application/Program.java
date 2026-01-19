package application;

public class Program {

	
//	ATRIBUTOS
	public double n1, n2, n3;
	public String name;
	
	
	
//	METODOS
	public double somaNotas() {
		return n1 + n2 + n3;
	}
	
	public void logicaPass() {
		if (somaNotas() >= 60) {
			System.out.println("PASS");
		} else {
			double faltaPontos = 60 - somaNotas();
			System.out.println("FAILED");
			System.out.println("MISSING " + faltaPontos + " POINTS" );
		}
	}
	
}
