package fr.boucles;

public class ExerciceTableauEntier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Cr�ation et remplissage d'un tableau � 10 valeurs de 1 � 10 */ 
		int[] entier= new int [10];
				
		int nombre=0;
		
		for (nombre= 0; nombre <=9 ; nombre ++) {
			
			int somme= nombre + 1;
			entier[nombre]= somme;
					
			System.out.println(entier[nombre]);
		}
		
		/* Afficher la premi�re ligne du tableau */
		
		System.out.println(entier[0]);
		
		/* Afficher la longeur du tableau */
		
		System.out.println(entier.length);
		
		/* Afficher le dernier �l�ment du tableau en utilisant la propri�t� length */
		
		System.out.println(entier[entier.length-1]);
		
		/* Modifier et remplacer l'�l�ment d'index 4 par 8 */
		
		entier[4] = 8;
		System.out.println(entier [4]);
	}
	

}
