package fr.algorithmie;

public class ComparaisonTableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ecrire le code permettant de compter le nombre d’éléments en commun dans ces 2 tableaux
		
		int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
		int commun=0;
		int nombre = 0;
		
		for (nombre=0; nombre <= array1.length-1; nombre ++) {
			
			if ( nombre <= array1.length -1  && nombre <= array2.length-1 ) {			
			 
				if ( array1[nombre] == array2[nombre] ) {			
					 	
					commun = commun + 1; 
					
				}
										
					
			if ( nombre <= array1.length -1 ) {			
				 
				if ( array1[nombre] == array2[nombre] ) {			
					 	
					commun = commun + 1; 
					
				}
												
				} 
			
		}	
			
		}
		
		System.out.println(commun);
	}

}
