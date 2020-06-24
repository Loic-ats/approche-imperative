package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercice FirstLast
		
		
		int[] array = {6,2,3,4,5,6,6};
		boolean element = true;
				
				
				if ( array[0] == array[array.length-1] ) {			
					 
					element=true;
		}
		
		else {
			 
			element = false;
									 	
		}
		
		System.out.println(element);
	}

}
