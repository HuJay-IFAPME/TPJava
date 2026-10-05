import java.util.*;

public class Exo7 {
    public static void main() {

        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un premier nombre : ");
        n1 = sc.nextInt();
        System.out.println("Entrez un deuxième nombre : ");
        n2 = sc.nextInt();

        int max = Math.max(n1, n2);
        System.out.println("Le nombre le plus grand est :"+max);
        sc.close();

    }
}
