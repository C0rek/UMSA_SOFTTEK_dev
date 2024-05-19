package main;

public class EjerComparando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// operacion 1
		System.out.println("Es 15 MOD 2 = 1? ");
		boolean valor = 15%2==1;
		System.out.println("La Comparacion es: "+valor);
		
		// operacion 2
		System.out.println("Es (10*10) <= (10^2) ?");	
		valor = (10*10)<=(10^2);
		System.out.println("La Comparacion con '^' es: "+valor);
		
		// operacion 2.1
		System.out.println("Es (10*10) <= (Math.pow(10,2)) ?");
		valor = (10*10)<=Math.pow(10, 2);
		System.out.println("La Comparacion con la funcion Math es: "+valor);
		
	}

}
