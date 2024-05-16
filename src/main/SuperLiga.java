package main;

import java.util.Scanner;

public class SuperLiga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int puntosPorGanado= 3, puntosPorEmpatado= 1, puntosPorPerdido= 0, cantDePartidos=0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("¿Con que equipo quiere trabajar?");
		String equipo = scanner.next();
		
		System.out.println("¿Cuantos partidos gano "+ equipo + " ?");
		int ganados = scanner.nextInt();
		
		System.out.println("¿Cuantos partidos empato "+ equipo + " ?");
		int empatados = scanner.nextInt();
		
		System.out.println("¿Cuantos partidos perdio "+ equipo + " ?");
		int perdidos = scanner.nextInt();
		
		cantDePartidos = ganados + perdidos + empatados;
		
		int puntosLiga = (ganados*puntosPorGanado + empatados*puntosPorEmpatado + perdidos*puntosPorPerdido);
		int porcentajeVictorias = (ganados * 100)/cantDePartidos;
		
		System.out.println("ESTADISTICAS " + equipo.toUpperCase() + " :");
		System.out.println("* Puntos de liga: "+ puntosLiga + " puntos en la competicion");
		System.out.println("* Porcentaje de Victorias: " + porcentajeVictorias + "% de eficiencia");
		
		scanner.close();

	}

}
