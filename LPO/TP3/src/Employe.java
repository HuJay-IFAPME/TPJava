public class Employe {
    private String nom;
    private boolean acompte;
    private int nbHeures;
    private float salaireHor;

    public void initialise (String nom, float salaireHor){
        this.nom = nom;
        this.salaireHor = salaireHor;
        this.nbHeures = 0;
        this.acompte = false;
    }

    public void demandeAcompte(){
        if (acompte == false){
            System.out.println("OK "+nom+", on vous verse 500€.");
            acompte = true;
        }else{
            System.out.println("Désolé "+nom+", un seul acompte par mois.");
        }
    }

    public void travail(int nbHeures){
        this.nbHeures += nbHeures;
        System.out.println(nom+" : "+nbHeures+" heures ce moi-ci.");
    }

    public float salaire(){
        float salaire = nbHeures*salaireHor;
        if (acompte == true){
            salaire -= 500;
        }
        return salaire;
    }
}
