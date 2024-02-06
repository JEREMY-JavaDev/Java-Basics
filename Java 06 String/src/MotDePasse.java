// Programme dereconnaissance de mot de passe

import java.util.Scanner;
public class MotDePasse {

	public static void main(String[] args) {
		// Variables
		int n = 1;
		String motDePasse = new String();// creation d'un objet String
		motDePasse = "";
		
		// Informations saisi par l'utilisateur
		Scanner clavier = new Scanner(System.in);
		while(motDePasse.equals("SeSaMe") == false && n<4) {
			System.out.println("Entrer le mot de passe : "); // Saisie de mot de passe
			motDePasse = clavier.next();
			n++; // Incrementation du compteur d'essaies
		}
		if(motDePasse.equals("SeSaMe")){
			System.out.print("Merci. Vous pouvez entrer.");
		} else {
			System.out.print("L'alarme va être déclenchéé !!");
		}
		clavier.close();
	}

}
