import java.util.*;

public class Exo3 {
    private String nom;
    private ArrayList<Integer> montFactures;

    //ArrayList plutôt qu'un tableau pour la taille dynamique.

    public Exo3(String nom, ArrayList<Integer> montFactures) {
        this.nom = nom;
        this.montFactures = montFactures;
    }

    public void moyenne() {
        int somme = 0;
        for (int facture : montFactures) {  // foreach parce que pas besoin des indices ou de modif.
            somme += facture;
        }
        double moyenne = (double) somme / montFactures.size();
        System.out.println("Montant moyen des commandes de "+this.nom+" : "+moyenne+"€");
    }
}
