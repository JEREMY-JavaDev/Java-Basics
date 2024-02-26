/*
Name : Programme permettant de calculer une équation du second dégré
Author : Jeremy Full Stack Java/Angular
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
        public  static Scanner scanner= new Scanner(System.in);
        public static void main(String[] args) {
                double a=0.0;
                double b=0.0;
                double c=0.0;
                //tant que a est nul demander à l'utilisateur une valeur
                while (a==0.0) {
                        System.out.print("Entrez une valeur non nulle pour a : ");
                        a= scanner.nextDouble();
                }

                System.out.print("Entrez une valeur pour b : ");
                b=scanner.nextDouble();
                System.out.print("Entrez une valeur pour c : ");
                c= scanner.nextDouble();
                double delta = b * b - 4.0 * a * c;
                if (delta < 0.0) {
                        System.out.println("Pas de solutions réelles");
                } else if (delta > 0.0) {
                        System.out.println("Deux solutions : " + (-b -Math.sqrt(delta))/(2.0 * a)
                                                                + " et " + (-b + Math.sqrt(delta))/2.0 * a);
                } else {
                        System.out.println("Une solution unique : "
                                                + -b / (2.0*a) );
                }
                System.out.println();

        }

}