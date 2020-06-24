package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] array = {3, -8, 17, 19} ;
		int[] rotation = new int[array.length];
		int nombre=0;
	
		
		
		for (nombre=0; nombre <= array.length-1; nombre ++) {
			
			
			if (nombre == 0 ) {
			
			rotation[nombre]= array[array.length -1];
			
			} 
			
			else {
		 
				rotation[nombre] = array[nombre-1];
								 	
			}
							
			System.out.println(rotation[nombre]);
			
		
		}
				
		}
	
		}



