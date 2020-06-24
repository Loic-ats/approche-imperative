package fr.algorithmie;
import java.util.Scanner;

public class InteractifFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Saisissez une valeur");
		int rang = scan.nextInt();
		int[] tab = new int[rang + 1];

		if (rang >= 0) {

			tab[0] = 0;

			if (tab.length > 1) {

				tab[1] = 1;

				for (int i = 2; i < tab.length; i++) {
					tab[i] = tab[i - 1] + tab[i - 2];
				}
			}

			System.out.println(tab[rang]);
		} else {
			System.out.println("Calcul impossible, vous devez saisir un rang positif ou nul.");
		}

		 /* Est ce que il faut obligatoirement mettre ?? */
		
		scan.close();
	}

}
