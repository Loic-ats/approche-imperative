package fr.algorithmie;

public class RechercheMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Rechercher le plus grand �l�ment du tableau
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int nombre=0;
		int top=array[0];
		
		for (nombre=0; nombre <= array.length-1; nombre ++) {
			
			if (nombre==0 || array[nombre] > top ) {
				
				top = array[nombre];
				
												
			}
						
		}
		
		System.out.println(top);
	}

}
