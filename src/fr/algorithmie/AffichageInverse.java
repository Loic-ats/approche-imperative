package fr.algorithmie;

public class AffichageInverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array= {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		/* Afficher les �l�ments du tableau grace � une boucle */
		
		int nombre=0;
		
			
		for (nombre=0; nombre <= array.length-1; nombre ++) {
			
					
			System.out.println(array[nombre]);
		}
		
		/* Afficher les �l�ments dans l'ordre inverse du tableau */
		
		for (nombre= array.length -1; nombre >= 0; nombre --) {
			
			
			System.out.println(array[nombre]);
		}
		
		/* Cr�er un tableau arrayCopy et copier tous les �l�ments de array dans arrayCopy */
		
		int [] arrayCopy  = new int [array.length];
		
		for (nombre=0; nombre <= array.length-1; nombre ++) {
			
			arrayCopy[nombre] = array[nombre];
			
			System.out.println(arrayCopy[nombre]);
		}
		
	}
}
