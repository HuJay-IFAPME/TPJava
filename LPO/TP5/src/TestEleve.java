public class TestEleve {
    public static void main(String[] args) {
        Eleve etu1 = new Eleve("Luc", 75.5f);
        Eleve etu2 = new Eleve("Nathalie");

        etu1.pourcEntre();
        etu1.setPourcent(80);
        etu2.pourcEntre();
        etu2.setPourcent(82.7f);
        etu2.pourcEntre();

    }
}
