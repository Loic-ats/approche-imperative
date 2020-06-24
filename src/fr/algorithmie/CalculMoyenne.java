package fr.algorithmie;

public class CalculMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int nombre = 0;
		int somme = 0;
		int moyenne=0;
		
		for (nombre=0; nombre <= array.length-1; nombre ++) {
			
		
				somme= somme + array[nombre];
			
										
									
		}
		
		moyenne = (somme / array.length); 
		
		System.out.println(moyenne);

	}

}
