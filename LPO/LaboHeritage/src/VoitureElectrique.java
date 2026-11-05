public class VoitureElectrique extends Vehicule{

    protected int autonomieKM;

    public VoitureElectrique(String immatriculation, double tarifJournalier, int autonomieKM) {
        super(immatriculation, tarifJournalier);
        this.autonomieKM = autonomieKM;
    }

    @Override
    public double calculPrixLocation(int jour){
        return jour*tarifJournalier*0.9;
    }
}
