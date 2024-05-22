package main;

import java.util.Scanner;
import main.OperacMatematicas;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el numero 1: ");
		int valor1 = scanner.nextInt();
		
		System.out.println("Ingrese el numero 2: ");
		int valor2 = scanner.nextInt();
		
		OperacMatematicas operacion = new OperacMatematicas();
		
		
		int resultado = operacion.sumar(valor1,valor2);
		System.out.println(resultado);
		
		resultado = operacion.restar(valor1,valor2);
		System.out.println(resultado);
		
		resultado = operacion.multiplicar(valor1,valor2);
		System.out.println(resultado);
		
		resultado = operacion.dividir(valor1,valor2);
		System.out.println(resultado);
		
		
		scanner.close();
	}

}
