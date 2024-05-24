package main.Clases;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuCalculadora {
	
	public void AbrirMenu() {
		int rta = 0;
		int accion = 1;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			try {
				System.out.println("INGRESE EL NUMERO 1: ");
				int n1 = scanner.nextInt();
				
				System.out.println("INGRESE EL NUMERO 2: ");
				int n2 = scanner.nextInt();
				
				System.out.println("DIGITA LA OPERACION" + 
						"\n1 - SUMAR " + 
						"\n2 - RESTAR " + 
						"\n3 - MULTIPLICAR " + 
						"\n4 - DIVIDIR " + 
						"\n5 - MODULO " +
						"\n0 - CERRAR ");
				int i = scanner.nextInt();
				
				OperacionesMatematicas operaciones = new OperacionesMatematicas();
				switch (i) {
				case 1: {
					rta = operaciones.sumar(n1, n2);
					break;
				}
				case 2: {
					rta = operaciones.restar(n1, n2);
					break;
				}
				case 3: {
					rta = operaciones.multiplicar(n1, n2);
					break;
				}
				case 4: {
					rta = operaciones.dividir(n1, n2);
					break;
				}
				case 5: {
					rta = operaciones.modulo(n1, n2);
					break;
				}
				case 0:{
					System.out.println("Cerrando Programa....\nVuelve pronto! <3");
					System.exit(0);
				}
				default:
					throw new IllegalArgumentException("Valor invalido " + i);	
				}	
				System.out.println("Respuesta: " + rta);	
			
			} catch (java.util.InputMismatchException e) {
				System.out.println("Error: Debe ingresar un valor numerico");
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			} finally {
				System.out.println("--------------");
				System.out.println("Ingrese 0 para salir del programa\nIngrese 1 para reiniciar el programa");
				accion = scanner.nextInt();
			}
		} while(accion!=0);
		System.out.println("Calculadora Finalizada. Gracias por usar <3");
		scanner.close();
	}
}
