import java.util.*;

public class Exo4 {
    public static void main() {

        float note1, note2, note3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez la première note : ");
        note1 = sc.nextFloat();
        System.out.println("Entrez la deuxième note : ");
        note2 = sc.nextFloat();
        System.out.println("Entrez la troisième note : ");
        note3 = sc.nextFloat();

        float moyenne = (note1+note2+note3)/3;
        int moyenne2 = (int) ((note1+note2+note3)*5/3);

        System.out.println("la moyenne est : " + moyenne + " et l'autre : " + moyenne2);

        sc.close();
    }
}
