import java.util.*;

public class Exo6 {
    public static void main() {

        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un premier nombre : ");
        n1 = sc.nextInt();
        System.out.println("Entrez un deuxième nombre : ");
        n2 = sc.nextInt();

        String max=(n1>n2)?"Le plus grand est "+n1:" Le plus grand est "+n2;
        System.out.println(max);

        sc.close();
    }
}
