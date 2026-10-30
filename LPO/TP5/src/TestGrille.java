public class TestGrille {
    final int[] numeros = {1,2,3,4,5,6};
    final int[] combiWin = {3,4,5,6,7,8};
    public void main(String[] args) {
        Grille joueur1 = new Grille(numeros);
        Grille gagnant = new Grille(combiWin);

        System.out.println("Grille : ");
        joueur1.afficher();
        joueur1.numGagnant(1);

        int tot = 0;
        for (int i = 0; i < numeros.length; i++) {
            if // comparer les deux tableaux
        }
    }
}
