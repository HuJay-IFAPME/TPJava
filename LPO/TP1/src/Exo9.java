import java.util.*;

public class Exo9 {
    public static void main() {

        double candidat;
        Scanner sc = new Scanner(System.in);
        System.out.println("Résultat du candidat : ");
        candidat = sc.nextDouble();

        if (candidat > 50){
            System.out.println("Candidat élu !");
        }else if (candidat > 12.5){
            System.out.println("En ballotage");
        }else{
            System.out.println("Battu");
        }

        String resultat=(candidat > 50)?"Candidat élu":(candidat>12.5)?"Candidat en ballottage":"Candidat battu";
        System.out.println(resultat);

        sc.close();
    }
}
