public class Employe {
    protected String nom, matricule;
    protected double salaireBase;

    public Employe(String nom, String matricule, double salaireBase) {
        this.nom = nom;
        this.matricule = matricule;
        this.salaireBase = salaireBase;
    }

    public double calculSalaire(){
        return salaireBase;
    }

    public void afficherInfos(){
        System.out.println("Nom : "+nom+" / Matricule : "+matricule+" / Salaire : "+salaireBase+" €");
    }
}
