import java.util.*;

public class etoiles {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le nombre d'étoiles par côté : ");
        int carre = sc.nextInt();



       /*for (int lignes = 0; lignes<carre; lignes++) {
            for (int colonnes = 0; colonnes <= carre; colonnes++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

       //triangle plein pointe bas-gauche
       for (int lignes = 0; lignes<carre; lignes++) {
            for (int colonnes = 0; colonnes <= lignes; colonnes++) {
                System.out.print(" * ");
            }
            System.out.println();
       }

        //triangle plein pointe bas-gauche => soluce du prof
        for (int lignes = 1; lignes <= carre; lignes++) {
            for (int colonnes = 1; colonnes <= carre; colonnes++) {
                System.out.print((lignes >=colonnes)?" * ":" ");
            }
            System.out.println();
        }
        //triangle plein pointe bas-gauche => soluce du prof
        for (int lignes = 1; lignes <= carre; lignes++) {
            for (int colonnes = 1; colonnes <= carre; colonnes++) {
                System.out.print((lignes <=colonnes)?"*":" ");
            }
            System.out.println();
        }
        for (int lignes = 1; lignes <= carre; lignes++) {
            for (int colonnes = 1; colonnes <= carre; colonnes++) {
                if (colonnes > lignes) {
                    System.out.print(" *");
                } else {
                    System.out.println("  ");
                }
            }*/
            sc.close();
        }
    }
}