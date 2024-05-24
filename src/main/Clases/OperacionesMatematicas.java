package main.Clases;

public class OperacionesMatematicas {
	
	public int sumar(int a, int b) {
		return a+b;
	}
	
	public int restar(int a, int b) {
		return a-b;
	}
	
	public int multiplicar(int a, int b) {
		return a*b;
	}
	
	public int dividir(int a, int b) throws ArithmeticException{
		return a/b;
	}
	
	public int modulo(int a, int b) {
		return a%b;
	}
	
	public void todasOperaciones(int a, int b) {
		System.out.println("\nSumar: " + this.sumar(a,b) +
				"\nResta: " + this.restar(a,b) +
				"\nMultiplicacion: " + this.multiplicar(a, b) +
				"\nDivision: " + this.dividir(a,b) + 
				"\nExponente: " + (Math.pow(a,b)) + 
				"\nDivision con FloorDiv: " + Math.floorDiv(a,b) + 
				"\nModulo: " + this.modulo(a,b) + 
				"\nRaiz cuadrada de a: " + Math.sqrt(a) +
				"\nRaiz cuadrada de b: " + Math.sqrt(b) );	
	}

}
