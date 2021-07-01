package zoo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Console implements Interaction {
	Scanner sc = new Scanner(System.in);
	ArrayList<String> choixCage = new ArrayList<String>();

	@Override
	public void afficherZoo(Zoo z) {
		System.out.println(z.toString());

	}

	@Override
	public void displayMainMenu() {
		System.out.println("Faites votre choix parmis les options suivantes: ");
		System.out.println("1.Afficher le zoo");
		System.out.println("2.Ajouter un animal");
		System.out.println("3.Ajouter une cage");
		System.out.println("0.Quitter le programme");
	}

	public void choixMenu(Zoo z) {
		int i = 0;
		try {
			i = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Mauvaise entrée! Réessayez!");
		}
		switch (i) {
		case 1:
			afficherZoo(z);
			break;
		case 2:
			z.ajouterAnimal(null, null);
			break;
		}
	}

	@Override
	public void run() {
		System.out.println("Welcome to Zoo!");

	}

}
