package fr.boucles;

public class ExerciceTableauEntier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Création et remplissage d'un tableau à 10 valeurs de 1 à 10 */ 
		int[] entier= new int [10];
				
		int nombre=0;
		
		for (nombre= 0; nombre <=9 ; nombre ++) {
			
			int somme= nombre + 1;
			entier[nombre]= somme;
					
			System.out.println(entier[nombre]);
		}
		
		/* Afficher la première ligne du tableau */
		
		System.out.println(entier[0]);
		
		/* Afficher la longeur du tableau */
		
		System.out.println(entier.length);
		
		/* Afficher le dernier élément du tableau en utilisant la propriété length */
		
		System.out.println(entier[entier.length-1]);
		
		/* Modifier et remplacer l'élément d'index 4 par 8 */
		
		entier[4] = 8;
		System.out.println(entier [4]);
	}
	

}
