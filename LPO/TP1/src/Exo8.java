import java.util.*;

public class Exo8 {
    public static void main() {

        int h, m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez une heure : ");
        h = sc.nextInt();
        System.out.println("Entrez les minutes : ");
        m = sc.nextInt();

        int totM = h*60+m+1; //tout convertir en nombre de minutes
        int newH = (totM/60)%24; // calcul de la nouvelle heure
        int mReste = totM%60;

        String resultat=(mReste == 0)?newH+"H00":newH+"H"+mReste;
        System.out.println(resultat);

        sc.close();
    }
}
