import java.util.*;

public class Exo2 {
    public static void main() {

        System.out.println("Introduisez le nombre de secondes");
        Scanner sc = new Scanner(System.in);
        int secondes = sc.nextInt();

        int minutes = secondes/60;
        int secondesReste = secondes%60;
        System.out.println("Minutes : " + minutes + " Secondes : " + secondesReste);
        System.out.printf("Minutes : %d , Secondes : %d", minutes, secondesReste);

        sc.close();
    }
}
