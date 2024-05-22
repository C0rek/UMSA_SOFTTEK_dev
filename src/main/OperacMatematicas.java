package main;
import java.util.Scanner;

public class OperacMatematicas {
	
	public int sumar(int a, int b) {
		return a+b;
	}
	
	public int restar(int a, int b) {
		return a-b;
	}
	
	public int multiplicar(int a, int b) {
		return a*b;
	}
	
	public int dividir(int a, int b) throws ArithmeticException {
		return a/b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el numero 1");
		int valor1 = scanner.nextInt();
		System.out.println("Ingrese el numero 2");	
		int valor2 = scanner.nextInt();
		
		System.out.println("Suma: " + (valor1+valor2));
		System.out.println("Resta: " + (valor1-valor2));
		System.out.println("Multiplicacion: " + (valor1*valor2));
		System.out.println("Division: " + (valor1/valor2));
		System.out.println("Exponente: " + (Math.pow(valor1, valor2)));
		System.out.println("Division con FloorDiv: " + Math.floorDiv(valor1, valor2));
		System.out.println("Modulo: " + (valor1%valor2));
		System.out.println("Raiz: " + Math.sqrt(valor2));
		
		scanner.close();
	}
	

}

