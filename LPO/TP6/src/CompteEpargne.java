public class CompteEpargne extends CompteBancaire{

    protected float txInteret;

    public CompteEpargne(String numero, float solde) {
        super(numero, solde);
        this.txInteret = 2.5f;
    }

    @Override
    public void debiter(float montant){
        if (solde <= 0){
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
