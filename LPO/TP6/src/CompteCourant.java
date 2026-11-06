public class CompteCourant extends CompteBancaire{

    protected float seuil, txInteret;

    public CompteCourant(String numero, float solde, float seuil) {
        super(numero, solde);
        this.seuil = seuil;
        this.txInteret = 1;
    }

    @Override
    public void debiter(float montant){
        if (solde-montant <= seuil){
            System.out.println("Débit impossible");
        }else {
            System.out.println("Montant débité : " + montant + " / Solde du compte : " + (solde-=montant));
        }
    }

    public float calculInteret(){
        double interets = solde*(txInteret/100);
        return (float) interets;
    }

    public void afficherInteret(){System.out.println("Revenus des intérêts : "+calculInteret()+" €");}
}
