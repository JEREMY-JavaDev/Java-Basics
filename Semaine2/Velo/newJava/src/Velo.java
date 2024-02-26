import java.util.Scanner;

public class Velo {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Donnez l'heure de début de la location (un entier) : ");
        int debut = clavier.nextInt();
        System.out.print("Donnez l'heure de fin de la location (un entier) : ");
        int fin = clavier.nextInt();
        int duree = fin -debut;

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        int tarif = 0;
        int montant = 0;
        if ((duree<0) && (duree>24)){
            System.out.println("Les heures doivent être comprises entre 0 et 24 !");
        } else if (duree== 0) {
            System.out.println("Bizarre, vous n'avez pas loué votre vélo bien longtemps !");
        } else if (duree<0) {
            System.out.println("Bizarre, le début de la location est après la fin ...");
        } else {
            switch (duree){
                case (duree >= 7) && (duree <= 17):
                    tarif = 2;
                    System.out.println("Vous avez loué votre vélo pendant");
                    System.out.print(" " +duree+ " au tarif horaire de" +tarif+ "franc(s)");
                    break;
                default:
                    tarif = 1;
                    System.out.println("Vous avez loué votre vélo pendant");
                    System.out.print(" " +duree+ " au tarif horaire de" +tarif+ "franc(s)");
                    break;
            }
        }

       /* if ((duree<0) &&(duree>24)){
            System.out.println("Les heures doivent être comprises entre 0 et 24 !");
        } else if (duree==0) {
            System.out.println("Bizarre, vous n'avez pas loué votre vélo bien longtemps !");
        } else if (duree<0) {
            System.out.println("Bizarre, le début de la location est après la fin ...");
        } else{
            System.out.println("Vous avez loué votre vélo pendant : " +duree+ "");
        }
        */

        /* System.out.println("Les heures doivent être comprises entre 0 et 24 !");
        System.out.println("Bizarre, vous n'avez pas loué votre vélo bien longtemps !");
        System.out.println("Bizarre, le début de la location est après la fin ...");
        System.out.println("Vous avez loué votre vélo pendant");
        System.out.print("Le montant total à payer est de ");
        System.out.println(" franc(s).");
        */


        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

        clavier.close();
    }
}
