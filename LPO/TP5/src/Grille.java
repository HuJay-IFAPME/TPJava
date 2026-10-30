public class Grille {
    private int[] tab;

    public Grille(int[] tab) {
        this.tab = tab;
    }

    public void afficher(){
        for(int grille : tab)
            System.out.println(grille);
    }

    public boolean numGagnant(int a){
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == a){
                return true;
            }
        }
        return false;
    }
}
