public class Manager extends Employe {

    private double primeFixe;

    public Manager(String nom, String matricule, double salaireBase) {
        super(nom, matricule, salaireBase);
    }

    @Override
    public double calculSalaire(){
        return salaireBase+primeFixe;
    }


}
