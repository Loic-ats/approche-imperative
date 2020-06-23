package fr.boucles;

public class ExerciceBouclesEtTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

		/* Afficher l'ensemble des éléments du tableau grace à une boucle */
		
				
		int nombre= 0;
		
		for (nombre=0; nombre <= array.length-1; nombre ++) {
			
					
			System.out.println(array[nombre]);
		}
		
		
		/* Afficher l'ensemble des éléments dans l'ordre inverse du tableau */
		
				
		for (nombre=array.length-1; nombre<= 0; nombre--) {
			
			
			System.out.println(array[nombre]);
		}
		
		/* Combiner une boucle et un test pour afficher que les entiers supérieurs à 3 */
		
		for (nombre=0; nombre <= array.length-1; nombre ++) {
			
			if (array[nombre]>3) {
				
				System.out.println(array[nombre]);
			}
			
			
		}
		
		/* Combiner une boucle et un test pour afficher que les entiers pair */
		
		for (nombre=0; nombre <= array.length-1; nombre ++) {
			
			if (array[nombre] % 2==0) {
				
				System.out.println(array[nombre]);
			}
			
			}
			/* Combiner une boucle et un test de manière à n'afficher que les valeurs des indexs impaires */
		
		for (nombre=0; nombre <= array.length-1; nombre ++) {
			
			if (nombre % 2!=0) {
				
				System.out.println(array[nombre]);
			}
			
			}
		
		/*  Combiner une boucle et un test de manière à afficher que les entiers impaire  */
		
		for (nombre=0; nombre <= array.length-1; nombre ++) {
			
			if (array[nombre] % 2!=0) {
				
				System.out.println(array[nombre]);
			}
			
			}
		
	}

}
