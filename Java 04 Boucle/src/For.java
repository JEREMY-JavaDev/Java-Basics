// Ce programme calcul des intérêts au fil des années.

import java.util.Scanner;
public class For {

	public static void main(String[] args) {
		// Déclarations et initiallisation
		double capitalInitial = 0.0;
		double tauxInteret = 0.0;
		int annees,i = 0;
		double capitalFinal = 0.0;
		
		//Saisie d'informations par l'utilisateur
		Scanner clavier = new Scanner(System.in);
		System.out.print("Entrer le capital initial : ");
		capitalInitial = clavier.nextDouble();
		System.out.print("Entrer le taux d'intérêt : ");
		tauxInteret = clavier.nextDouble();
		System.out.print("Entrer le nombre d'années : ");
		annees = clavier.nextInt();
		capitalFinal = capitalInitial;
		clavier.close();
		
		// Boucle
		for (i = 1; i <= annees; i++) {
			capitalFinal = (1 + tauxInteret/100)*capitalFinal;
		}
		System.out.print("Le capital final est de : "+ capitalFinal);
		System.out.print(" et les intérêts acquis au bout de " + annees + "an(s) sont de : ");
		System.out.printf("%5.2f", capitalFinal - capitalInitial);
		System.out.println();
		
		
		
	}

}
