// Même programme que le précédent mais les soldes vont de 0 à 9 pour 0% à 90%

import java.util.Scanner;
public class PrixSolde2 {

	public static void main(String[] args) {
		// Déclaration et initiallisation des variables
		
		int codeSolde = 0;
		double prix = 0.0;
		double prixSolde = 0.0;
		
		Scanner clavier = new Scanner(System.in);
		//Saisie d'information par l'utilisateur
		System.out.print("Entrer le prix du produit : ");
		prix = clavier.nextDouble();
		System.out.print("Entrer le code solde entre 0 et 9 pour 0% a 90% : ");
		codeSolde = clavier.nextInt();
		
		// switch 
		
		switch (codeSolde) {
		case 1 : 
			prixSolde = prix -(prix*10)/100;
			System.out.print("Le prix avec solde est de :" +prixSolde+ "Euros.");
			break;
		case 2 :
			prixSolde = prix -(prix*20)/100;
			System.out.print("Le prix avec solde est de :" +prixSolde+ "Euros.");
			break;
		case 3 :
			prixSolde = prix -(prix*30)/100;
			System.out.print("Le prix avec solde est de :" +prixSolde+ "Euros.");
			break;
		case 4 :
			prixSolde = prix -(prix*40)/100;
			System.out.print("Le prix avec solde est de :" +prixSolde+ "Euros.");
			break;
		case 5 :
			prixSolde = prix -(prix*50)/100;
			System.out.print("Le prix avec solde est de :" +prixSolde+ "Euros.");
			break;
		case 6 :
			prixSolde = prix -(prix*60)/100;
			System.out.print("Le prix avec solde est de :" +prixSolde+ "Euros.");
			break;
		case 7 :
			prixSolde = prix -(prix*70)/100;
			System.out.print("Le prix avec solde est de :" +prixSolde+ "Euros.");
			break;
		case 8 :
			prixSolde = prix -(prix*80)/100;
			System.out.print("Le prix avec solde est de :" +prixSolde+ "Euros.");
			break;
		case 9 :
			prixSolde = prix -(prix*90)/100;
			System.out.print("Le prix avec solde est de :" +prixSolde+ "Euros.");
			break;
		default :
			prixSolde = prix -(prix*0)/100;
			System.out.print("Le prix avec solde est de :" +prixSolde+ "Euros. Desole vous n'avez pas de solde");
			break;
			
		}
		
		
		clavier.close();
	}

}
