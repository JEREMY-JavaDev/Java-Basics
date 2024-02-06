// Affiche les intérêts années après années dans un tableau static

import java.util.Scanner;
public class Tableau {

	public static void main(String[] args) {
		// Variables
		int annees = 0;
		int i = 0;
		double tauxInteret = 0.0;
		double capitalInitial = 0.0;
		double capitalFinal = 0.0;
		
		//Saisie des valeurs 
		Scanner clavier = new Scanner(System.in);
		System.out.print("Quel est le montant du capital à placer? :");
		capitalInitial = clavier.nextDouble();
		System.out.print("Combien d'années le capitial va-t-il être placé? :");
		annees = clavier.nextInt();
		System.out.print("Quel est le taux d'intérêt du placement? :");
		tauxInteret = clavier.nextDouble();
		capitalFinal = capitalInitial;
		clavier.close();
		
		// Déclaration du Tableau
		double tabInterets [] = new double [annees]; 
		
		//Boucle
		
		for (i =0; i < tabInterets.length; i++) {
			capitalFinal = (1+ tauxInteret/100)*capitalFinal;
			tabInterets[i] = capitalFinal - capitalInitial;
			System.out.print("Les intérêts acquis au bout de "+ (i+1)+ "an(s) sont de :");
			System.out.println(tabInterets[i]+ " euros");
			
		}
		
		
	}

}
