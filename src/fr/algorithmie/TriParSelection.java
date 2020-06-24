package fr.algorithmie;

public class TriParSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Implémenter la méthode tri par sélection (classer par ordre croissant)
				
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
		int[] croissant = new int [array2.length];
		int nombre=0;
		int low=array2[0];
		
		for (nombre=0; nombre <= array2.length-1; nombre ++) {
			
			if (nombre==0 || array2[nombre] < low ) {
				
				low = array2[nombre];
														
			}
						
		}
		
			
		System.out.println(low);
	}

}
