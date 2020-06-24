package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		int [] arrayCopy  = new int [array.length];
		
		int nombre = 0;
		
		//  Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy mais dans l’ordre inverse.
		
		for (nombre= array.length -1; nombre >= 0; nombre --) {
			
			arrayCopy[nombre] = array[nombre];
			
			System.out.println(arrayCopy[nombre]);
		}
		
		//  Afficher l’ensemble des éléments des 2 tableaux 
		
		
		for (nombre=0; nombre <= array.length-1; nombre ++) {
			
			
			System.out.println(array[nombre]);
			System.out.println(arrayCopy[nombre]);
		}
		
		
		
	}

}
