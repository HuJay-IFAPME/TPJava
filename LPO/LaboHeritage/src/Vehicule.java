public class Vehicule {

    protected String immatriculation;
    protected double tarifJournalier;

    public Vehicule(String immatriculation, double tarifJournalier) {
        this.immatriculation = immatriculation;
        this.tarifJournalier = tarifJournalier;
    }

    public double calculPrixLocation(int jour){
        return jour*tarifJournalier;
    }
}
