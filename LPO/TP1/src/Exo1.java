import java.util.*;

public class Exo1 {
    public static void main(String[] args) {

        double h,b,s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduisez la hauteur du triangle");
        h = sc.nextDouble();
        System.out.println("Introduisez la base");
        b = sc.nextDouble();

        s = h*b/2;
        System.out.println("La surface est " + s);
        System.out.printf("La surface est %f", s); // deux méthodes un résultat. Ici on inject un float.

        sc.close(); //toujours fermer son scanner
    }
}
