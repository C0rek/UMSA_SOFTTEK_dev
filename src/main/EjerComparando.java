package main;

public class EjerComparando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int operacion1 = 15%2;
		int operacion2 = 0;
		boolean valor = true;
		
		System.out.println("Es 15 MOD 2 = 1? ");
		
		if(operacion1==1) {
			valor=true;
		} else {
			valor=false;
		}
		
		System.out.println("La Comparacion es: "+valor);
		
		System.out.println("Es (10*10) <= (10^2) ?");
		operacion1=10*10;
		operacion2=10^2;
		if(operacion1<=operacion2) {
			valor=true;
		} else {
			valor=false;
		}
		System.out.println("La Comparacion con '^' es: "+valor);
		
		System.out.println("Es (10*10) <= (Math.pow(10,2)) ?");
		operacion1=10*10;
		operacion2=(int) Math.pow(10, 2);
		if(operacion1<=operacion2) {
			valor=true;
		} else {
			valor=false;
		}
		System.out.println("La Comparacion con la funcion Math es: "+valor);
		
	}

}
