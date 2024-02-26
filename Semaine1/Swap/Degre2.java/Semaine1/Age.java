package Semaine1;
import java.util.Scanner;
public class Age {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int age;
		 
		
		
		System.out.print("Entrez votre age : ");
		age = scanner.nextInt();
		int annee = 2023-age;
		
		
		
		scanner.close();
		System.out.println("Votre année de naissane est : " +annee);
	}

}



