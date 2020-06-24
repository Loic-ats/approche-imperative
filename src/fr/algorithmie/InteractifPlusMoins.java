package fr.algorithmie;

import java.util.Scanner;
import java.util.Random;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * choisit un nombre aléatoire entre 1 et 100 Lorsque l’utilisateur a trouvé le
		 * nombre, le programme affiche « Bravo, vous avez trouvé en N coups » où N
		 * représente le nombre d’essais effecté par l’utilisateur
		 */

		boolean number = false;
		int coups = 0;

		Random r = new Random();
		int cible = r.nextInt(100);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre comprit entre 1 et 100");
		
		while (number == false) {

			
			int nb = scanner.nextInt();

			if (nb<cible) {

				number = false;
				coups = coups + 1;
				System.out.println(" Le chiffre saisit est inférieur à nombre mistère ");

			}

			else if (nb>cible ) {

				number = false;
				coups = coups +1;
				System.out.println("Le chiffre saisit est supérieur au nombre mistère");

			}
			
			else {
				
				number=true;
				coups = coups + 1;
				System.out.println("Bravo, vous avez trouvé en " + coups +" coups");
			}
			
			}

			
		}

	}

