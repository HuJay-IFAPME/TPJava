public class Camionette extends Vehicule{

    protected double volumeM3;

    public Camionette(String immatriculation, double tarifJournalier, double volumeM3) {
        super(immatriculation, tarifJournalier);
        this.volumeM3 = volumeM3;
    }

    @Override
    public double calculPrixLocation(int jour){
        if (volumeM3 > 10){
            return (jour*(tarifJournalier+20));
        }else{
            return jour*tarifJournalier;
        }
    }
}
