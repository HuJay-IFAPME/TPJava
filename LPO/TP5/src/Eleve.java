public class Eleve {
    private String nom;
    private float pourcent;

    public Eleve(String nom, float pourcent) {
        this.nom = nom;
        this.pourcent = pourcent;
    }

    public Eleve(String nom) {
        this.nom = nom;
        this.pourcent = -1; // définition du % sur -1 pour permettre le booléen et la condition du set.
    }

    // possibilité d'enlever les sout pour simplifier et faire un sout(objet.pourcEntre()); dans le main
    // mais plus lisible comme ça
    public boolean pourcEntre(){
        if (pourcent != -1) {
            System.out.println(this.nom+" a passé l'examen");
            return true;
        }else {
            System.out.println(this.nom+" n'a pas passé l'examen");
            return false;
        }
    }

    public void setPourcent(float pourcent) {
        if (this.pourcent != -1)
            System.out.println("Erreur, note déjà encodée"); // le -1 empêche le changement de note.
        else
            this.pourcent = pourcent;
    }
}
