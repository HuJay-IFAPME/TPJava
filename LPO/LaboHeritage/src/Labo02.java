import java.util.ArrayList;
import java.util.List;

public class Labo02 {

    static void main(String[] args) {

        Camionette c = new Camionette("1-AZE-123", 80, 12);
        VoitureElectrique ve = new VoitureElectrique("2-RTY-456", 50, 400);
        ArrayList<Vehicule> flotte = new ArrayList<>(List.of(c, ve));

        for (Vehicule v : flotte)
            System.out.println("Immatriculation : "+v.immatriculation+" / Prix : "+v.calculPrixLocation(3));
    }
}
