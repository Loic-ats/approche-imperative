package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Ecrire un programme qui demande un nombre à l’utilisateur et affiche les 10
		 * suivants
		 */

		int input = 0;
		int nombre = 0;
		int[] array = new int[11];

		Scanner scanner = new Scanner(System.in);

		System.out.println("Veuillez saisir un nombre");
		int nb = scanner.nextInt();

		for (nombre = 0; nombre <= array.length - 1; nombre++) {

			array[nombre] = nb + nombre;

			System.out.println(array[nombre]);
		}

	}

}
