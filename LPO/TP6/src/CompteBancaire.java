public class CompteBancaire {

    protected String numero;
    protected float solde;

    public CompteBancaire(String numero, float solde) {
        this.numero = numero;
        this.solde = solde;
    }

    public void afficherSolde(){
        System.out.println("Solde du compte : "+solde+" €");
    }

    public void crediter(float montant){
        System.out.println("Montant crédité : "+montant+" / Solde du compte : "+(solde+=montant));
    }

    public void debiter(float montant){
        System.out.println("Montant débité : " + montant + " / Solde du compte : " + (solde-=montant));
    }

}