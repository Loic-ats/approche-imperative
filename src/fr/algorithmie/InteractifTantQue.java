package fr.algorithmie;
import java.util.Scanner;

public class InteractifTantQue {

	// Ecrire un programme qui demande un nombre à l’utilisateur qui doit être obligatoirement compris entre 1 et 10 avec TantQue
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 0;
		boolean number = false;

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
				System.out.println(nb);

			}

		}
	}
}
