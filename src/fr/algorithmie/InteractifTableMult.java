package fr.algorithmie;
import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
/* Ecrire un programme qui demande un nombre à l’utilisateur qui doit être obligatoirement compris entre 1 et 10 avec TantQue
   et affiche la table de multiplication du nombre*/
			

			int input = 0;
			boolean number = false;
			int nombre = 0;
			int [] array = new int [11];

			Scanner scanner = new Scanner(System.in);

			while (number == false) {

				System.out.println("Veuillez saisir un nombre comprit entre 1 et 10");
				int nb = scanner.nextInt();

				if (nb < 1 || nb > 10) {

					number = false;
					System.out.println("Non valide");

				}

				else {

					number = true;
					
					for (nombre=0; nombre <= array.length-1; nombre ++) {
						
						array[nombre] = nb*nombre ;
						
						System.out.println(array[nombre]);
					}
					
				}

			}
	}

}

