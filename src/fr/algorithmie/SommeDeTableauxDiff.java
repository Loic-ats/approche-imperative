package fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int[] tab = {-1, 12, 17, 14, 5, -9, 0, 18 } ;
		int[] somme  = new int [array.length];
		int nombre = 0;
		
		
		for (nombre=0; nombre <= array.length-1; nombre ++) {
			
			if ( nombre <= array.length -1  && nombre <= tab.length-1 ) {			
			 
				somme [nombre] = array[nombre] + tab[nombre]; 
				
			} 
			
			else {
			 
				somme [nombre] = array[nombre];
				
									
			 	
			}
			
			System.out.println(somme[nombre]);
			
			}
		
					
	}

}
