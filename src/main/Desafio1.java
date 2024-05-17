package main;

public class Desafio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// DATOS PRIMITIVOS
		int tipoDato1 = 0;	// 4 bytes de almacenado -2,147,483,648 a 2,147,483,647.
		double tipoDato2 = 0.0;	// 64 bits de almacenado 4.9E-324 a 1.7976931348623157E308..
		float tipoDato3 = 1.5f;		// 32 bytes de almacenado 1.4E-45 a 3.4028235E38.
		boolean tipoDato4=true;
		char tipoDato5='a';		// simple caracter unicode de 16 bits.
		byte tipoDato6=120;	// 1 solo byte de almacenado -128,127
		long tipoDato7=	700000000;	// 8 bytes de almacenado -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807.
		
		System.out.println(tipoDato1+" "+tipoDato2+" "+tipoDato3+" "+tipoDato4+" "+tipoDato5+" "+tipoDato6+" "+tipoDato7);
		
	}

}
