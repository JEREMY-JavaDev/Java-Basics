package Semaine1;

import java.util.Scanner;
class IMC {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double poids = 74.5 ;
		double taille = 1.75 ;
		
		System.out.print("Entrez un poids (en Kg : ");
		poids = scanner.nextDouble();
		System.out.print("Entrez une taille (en m) : ");
		taille = scanner.nextDouble();
		
		double imc = poids / (taille*taille);
		
		scanner.close();
		System.out.println("Pour " + poids+ " kd et " + taille + "m, l'IMC est de " +imc);
	}
}