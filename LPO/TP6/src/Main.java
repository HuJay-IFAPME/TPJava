import java.util.*;

public class Main {
    static void main(String[] args) {
        CompteBancaire[] comptes = new CompteBancaire[2];

        comptes [0] = new CompteCourant ("BE123456", 100.54f, -20.00f);
        comptes [1] = new CompteEpargne ("BE789012", 2000.54f);

        for (CompteBancaire cb : comptes) {
            cb.afficherSolde();
            cb.crediter(200);
            cb.debiter(300);
        }

        ((CompteCourant) comptes[0]).afficherInteret();
        ((CompteEpargne) comptes[1]).afficherInteret();

    }
}
