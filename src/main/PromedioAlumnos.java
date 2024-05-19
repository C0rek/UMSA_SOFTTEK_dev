package main;

import java.util.Scanner;

public class PromedioAlumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cantNotas = 3, promedio=0, valor=0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre del alumno");
		String nombreAlum = scanner.next();
		
		for(int i=0; i<cantNotas; i++) {			
		System.out.println("Digitalice la nota " + (i+1));
		valor = scanner.nextInt();
		promedio=promedio+valor;
		}
		
		promedio=promedio/cantNotas;
		// promedio = Math.pow(cantNotas, valor) con libreria Math
		
		System.out.println("El promedio de notas de " + nombreAlum + " es igual a " + promedio);
		scanner.close();

	}

}
