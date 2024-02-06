
// Ce programme calcule le pourcentage d'un solde en fonction du code saisi par l'utilisateur.

import java.util.Scanner;
public class PrixSolde {

	public static void main(String[] args) {
		
		// Déclarations des variables


		int codeSolde = 0;
		double prix = 0.0;
		double prixSolde = 0.0;
		
		
		Scanner clavier = new Scanner (System.in);
		 //Demande d'informations à l'utilisateur
		
		System.out.print("Entrer le prix de l'article en euros : ");
		prix = clavier.nextDouble();
		System.out.print("Entrer le code du solde : 1 pour -20% ou 2 pour -50%: ");
		codeSolde = clavier.nextInt();
		
		//Instruction conditionelle
		
		if(codeSolde == 1) {
			prixSolde = prix -((prix*20)/100);
			System.out.println("Le prix soldé est de : " +prixSolde+"€.");
		}else {
			prixSolde = prix -((prix*50)/100);
			System.out.println("Le prix avec solde est de : "+prixSolde+"€.");
		}

		clavier.close();
	}

}
