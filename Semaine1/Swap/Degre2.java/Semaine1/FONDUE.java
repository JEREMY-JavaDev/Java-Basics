package Semaine1;


import java.util.Scanner;
public class FONDUE {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final byte BASE = 4; //le nombre de personnes pour laquelle est conçue la recette de base
		double fromage = 800.0; //quantité de fromage en grammes nécessaire pour BASE personnes
		double eau = 2.0; // la quantité d'eau en décilitres nécessaire pour BASE personnes 
		double ail = 2.0; // nombre de gousses d'ail nécessaires pour BASE personnes
		double pain = 400.0; //  quantité de pain en grammes nécessaire pour BASE personnes
		
		
		System.out.print("Entrez le nombre de convives pour lequel on veut préparer la recette: ");
		int nbConvives = scanner.nextInt();
		
		double Nfromage = (fromage*nbConvives)/BASE;
		double Neau = (eau*nbConvives)/BASE;
		double Nail = (ail*nbConvives)/BASE;
		double Npain = (pain*nbConvives)/BASE;
		
		System.out.println("Pour faire une fondue fribourgeoise pour " +nbConvives+ " personnes, il vous faut: ");
		System.out.println("-" +Nfromage+ "gr de Vacherin fribourgeois");
		System.out.println("-" +Neau+ "dl d'eau");
		System.out.println("-" +Nail+ " gousse(s) d'ail");
		System.out.println("-" +Npain+ "gr de pain");
		System.out.println("-du poivre à volonté");
		
		scanner.close();
		System.out.println("Bonne Dégustation");
		
		
	}

}
