package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Ecrire un programme qui demande un nombre à l’utilisateur et affiche la somme 
		 * des entiers
		 */
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre");
		int nb = scanner.nextInt();
		

		int somme = 0;
				
		
		for (int nombre = 0; nombre <= nb ; nombre++) {

			
			somme = somme + nombre;

			
		}
		
		System.out.println(somme);
		
	}

}
