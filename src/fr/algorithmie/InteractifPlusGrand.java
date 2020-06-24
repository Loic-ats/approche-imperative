package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Ecrire un programme qui demande 10 nombres à un utilisateur et 
		 * qui affiche le plus grand de ces nombres.
		 */
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Veuillez saisir 10 nombre");
		
		int [] array = new int [10];
		int top = 0;
		
		for (int nombre = 0; nombre <= array.length-1 ; nombre++) {

			
			int nb = scanner.nextInt();
			array[nombre] = nb;

			if (nombre==0 || array[nombre] > top ) {
				
				top = array[nombre];
				
										
			}
		}
			
		System.out.println(top);
	}

}
