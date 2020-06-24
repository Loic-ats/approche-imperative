package fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		int nombre=0;
		
		//Combiner une boucle et un test de manière à n’afficher que les entiers supérieurs à 3
		
		for (nombre=0; nombre <= array.length-1; nombre ++) {
			
			if (array[nombre]>3) {
				
				System.out.println(array[nombre]);
			}
			
			
		}
		
		//Combiner une boucle et un test de manière à n’afficher que les entiers pairs
		
		for (nombre=0; nombre <= array.length-1; nombre ++) {
			
			if (array[nombre] % 2==0) {
				
				System.out.println(array[nombre]);
			}
			
			}
		
		//Combiner une boucle et un test de manière à n’afficher que les valeurs correspondant aux index pairs
		
		for (nombre=0; nombre <= array.length-1; nombre ++) {
			
			if (nombre % 2==0) {
				
				System.out.println(array[nombre]);
			}
			
			}
		
		
		// Combiner une boucle et un test de manière à n’afficher que les entiers impairs
		
		for (nombre=0; nombre <= array.length-1; nombre ++) {
			
			if (array[nombre] % 2!=0) {
				
				System.out.println(array[nombre]);
			}
			
			}
		
			
	}

}
