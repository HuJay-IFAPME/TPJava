import java.util.*;

public class Grille {
    private Case[][] cases;

    public Grille() {
        this.cases = new Case[15][15];
    }

    public void afficherGrille(){
        for (int ligne = 0; ligne < cases.length; ligne++) {
            for (int col = 0;  col < cases[ligne].length; col++) {
                System.out.print(cases[ligne][col]+" ");
            }
            System.out.println();
        }
    }

    public boolean estPlacementValide(String mot, int ligne, int col, char sens){
        return false;
    }

    public void placerMot(String mot, int ligne, int col, char sens){

    }

    public Case getCase(int ligne, int col){
        return cases[ligne][col];
    }
}