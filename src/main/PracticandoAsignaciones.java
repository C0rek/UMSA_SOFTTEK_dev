package main;

import java.util.Scanner;

public class PracticandoAsignaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aux=0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el numero de A");
		int A = scanner.nextInt();
		System.out.println("Ingrese el numero de B");
		int B = scanner.nextInt();
		System.out.println("Ingrese el numero de C");
		int C = scanner.nextInt();
		System.out.println("Ingrese el numero de D");
		int D = scanner.nextInt();

		System.out.println("B -> C");
		aux = B;
		B = C;
		System.out.println("Imprimo B: " + B);
		System.out.println("C -> A");
		C = A;
		System.out.println("Imprimo C: " + C);
		System.out.println("A -> D");
		A = D;
		System.out.println("Imprimo A: " + A);
		System.out.println("D -> B");
		D = aux;
		System.out.println("Imprimo D: " + D);
		
		scanner.close();
	}

}
