public class Lettre {
    private char caractere, lettreRepresentee;
    private int valeur;
    private boolean joker;

    public Lettre(char caractere, char lettreRepresentee, int valeur, boolean joker) {
        this.caractere = caractere;
        this.lettreRepresentee = lettreRepresentee;
        this.valeur = valeur;
        this.joker = joker;
    }

    public char getCaractere() {
        return caractere;
    }

    public int getValeur() {
        return valeur;
    }

    public boolean estJoker(){
        return false;
    }

    public char getLettreRepresentee() {
        return lettreRepresentee;
    }
}
