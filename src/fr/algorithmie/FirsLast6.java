package fr.algorithmie;

public class FirsLast6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Exercice FirstLast
			
		int[] array = {1,2,3,4,5,6,6};
		boolean element = true;
				
		
		if ( array[0] == 6 || array[array.length-1]== 6 ) {			
			 
					element=true;
		}
		
		else {
			 
			element = false;
									 	
		}
		
		System.out.println(element);
		
	}

}
