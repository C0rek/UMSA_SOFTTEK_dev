package main.Clases;

public class Desafio1y2 {
	
	
	// DESAFIO 1 = mencionar al menos 6 tipos de datos
	private int tipoDato1 = 0;	// 4 bytes de almacenado -2,147,483,648 a 2,147,483,647.
	private double tipoDato2 = 0.0;	// 64 bits de almacenado 4.9E-324 a 1.7976931348623157E308..
	private float tipoDato3 = 1.5f;		// 32 bytes de almacenado 1.4E-45 a 3.4028235E38.
	private boolean tipoDato4=true;
	private char tipoDato5='a';		// simple caracter unicode de 16 bits.
	private byte tipoDato6=120;	// 1 solo byte de almacenado -128,127
	private long tipoDato7=	700000000;	// 8 bytes de almacenado -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807.
	
	public void imprimirDatos(){
		System.out.println(tipoDato1+" "+tipoDato2+" "+tipoDato3+" "+tipoDato4+" "+tipoDato5+" "+tipoDato6+" "+tipoDato7);
	}
	
	// DESAFIO 2 = 
	/*a. Debes pensar y escribir un algoritmo que nos permita guardar tipos de datos numéricos en dos variables, 
	 * y que calcule el valor de su suma, resta, producto y división.
	 *
	 *b. Además, si el resultado de la suma es mayor a 5, debes colocar una variable lógica como verdadera.
	 *
	 *Desarrollo
	 *a.
	 *	Entero numero1 = 2
	 *	Entero numero2 = 1
	 *	bandera = falso
	 *	resultado = 0
	 *
	 *	resultado = numero1+numero2
	 *	resultado = numero1-numero2
	 *	resultado = numero1*numero2
	 *	resultado = numero1/numero2 con numero2 != 0
	 *b.  
	 *	si resultado es > a 5
	 *	la bandera va a ser verdadera
	 *	si no es > a 5
	 *	la bandera va a ser falsa
	 * */
}
