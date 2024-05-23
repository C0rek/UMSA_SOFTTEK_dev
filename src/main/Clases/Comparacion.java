package main.Clases;

public class Comparacion {
	
	
	public void compararResto(int n1, int n2) {
		boolean valor = (n1%n2==0);
		System.out.println("Resto igual a cero?: " + valor);
	}
	
	public void compararConSigno() {
		System.out.println("Es (10*10) <= (10^2) ?");	
		boolean valor = (10*10)<=(10^2);
		System.out.println("La Comparacion con '^' es: "+valor);
	}
	
	public void compararConMathPow() {
		System.out.println("Es (10*10) <= (Math.pow(10,2)) ?");
		boolean valor = (10*10)<=Math.pow(10, 2);
		System.out.println("La Comparacion con la funcion Math es: "+valor);
	}
	

}
