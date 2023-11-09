// Programme calcule le quotient de 2 entiers entrés par l'utilisateur et l'affiche dans la console

import java.util.Scanner;

public class Quotient2 {

	public static void main(String[] args) {
		 int diviseur;
		 double dividende;
		 double quotient;
		 
		 // Enregistrement des valeurs tapées par l'utilisateur


		 Scanner clavier = new Scanner (System.in);
		 System.out.print("Entrer le dividende : ");
		 dividende = clavier.nextDouble();
		 System.out.print("Entrer le diviseur : ");
		 diviseur = clavier.nextInt();

		 // Calcul du quotient
		 quotient = dividende / diviseur;
		 
		 // Affichage du résultat dans la console
		 System.out.print("Le quotient de la division est :" +quotient+ ".");
		 
		 clavier.close();

	}

}
