import java.util.*;

public class distributeur {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choix = -1;

        while (choix !=789){
            System.out.println("====== DISTRIBUTEUR DE BOISSONS ======");
            System.out.println("1. Eau : 1,00 €");
            System.out.println("2. Café : 1,50 €");
            System.out.println("3. Thé : 1,50 €");
            System.out.println("4. Chocolat chaud : 2,OO €");
            System.out.println("======================================");
            System.out.println("Votre choix : ");

            choix = sc.nextInt();
            double prix;
            String boisson;

            switch (choix) {
                case 789:
                    System.out.println("Arrêt du programme");
                    continue;
                case 0:
                    System.out.println("Commande annulée");
                    continue;
                case 1:
                    boisson = "Eau";
                    prix = 1.00;
                    break;
                case 2:
                    boisson = "Café";
                    prix = 1.50;
                    break;
                case 3:
                    boisson = "Thé";
                    prix = 1.50;
                    break;
                case 4:
                    boisson = "Chocolat Chaud";
                    prix = 2.00;
                    break;
                default:
                    System.out.println("Choix invalide");
                    System.out.println("Veullez sélectionner un numéro de 1 à 4");
                    continue;
            }


            System.out.println("Vous avez sélectionné : " + boisson + "(" + prix + ")");

            System.out.println("Somme introduite : ");
            double montantIntro = sc.nextDouble();
            double montantManq;
            double monnaie;

            if (montantIntro > prix){
                monnaie = montantIntro - prix;
                System.out.println(boisson + " distribuée ; monnaie : " + monnaie + " €");
            }else if (montantIntro < prix){
                montantManq = prix - montantIntro;
                System.out.println("Paiment insuffisant ; manque : " + montantManq + " €");
            }else{
                System.out.println(boisson + " distribuée");
            }

        }
    }
}
