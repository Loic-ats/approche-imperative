package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Faire un programme avec le menu suivant : 1: Ajouter un nombre 
		 * 2: Afficher les nombres existants.
		 */
		Scanner scanner = new Scanner(System.in);

		int nombreelement = 0;
		int nombre = 0;
		int[] array = new int[100];

		System.out.println("option 1 : Ajouter un nombre");
		System.out.println("Option 2 : Afficher les nombres existant");
		System.out.println("Choisir l'option 1 ou l'option 2 ");

		int option = scanner.nextInt();

		while (option == 1) {

			System.out.println("Veuillez saisir votre chiffre");
			int saisi = scanner.nextInt();

			nombreelement = nombreelement + 1;
			array[nombreelement - 1] = saisi;

			System.out.println("Souhaitez vous afficher les résultat (2) ou saisir un nouveau chiffre (1) ");
			option = scanner.nextInt();

		}

		System.out.println("Voici les nombres saisi");
		for (nombre = 0; nombre <= nombreelement; nombre++) {

			System.out.println(array[nombre]);

		}

	}

}
