package fr.algorithmie;

public class SommeDeTableaux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int[] tab = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1} ;
		int[] somme  = new int [array.length];
		int nombre = 0;
		
		for (nombre=0; nombre <= array.length-1; nombre ++) {
			
	
				
				 somme [nombre] = array[nombre] + tab[nombre];
				
				System.out.println(somme[nombre]);
						
					
		}

	}

}
