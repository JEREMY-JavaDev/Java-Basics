//Ce programme calcul le nombre d'années nécessaire pour obtenir un gain

import java.util.Scanner;
public class While {

	public static void main(String[] args) {
		// Variables
		int annees = 0;
		double tauxInteret = 0.0;
		double capitalInitial = 0.0;
		double capitalFinal = 0.0;
		double gain = 0.0;
		
		// Saisie d'informations 
		Scanner clavier = new Scanner(System.in);
		
		System.out.print("Quel est le montant du capital à placé?: ");
		capitalInitial = clavier.nextDouble();
		System.out.print("Quelest le taux d'intérêt du placement? :");
		tauxInteret = clavier.nextDouble();
		System.out.print("Quel est le gain souhaité? :");
		gain = clavier.nextDouble(); // le gain doit être strictement positif
		capitalFinal = capitalInitial;
		clavier.close();
		
		//Boucle while
		while (capitalFinal - capitalInitial < gain) {
			annees++;
			capitalFinal = (1 + tauxInteret/100)*capitalFinal;
		
		}
		System.out.println("Le gain de ");
		System.out.printf("%6.0f", gain);
		System.out.print("Euros sera atteint au bout de "+ annees +" an(s).");

	}

}
