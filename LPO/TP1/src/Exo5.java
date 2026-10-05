import java.util.*;

public class Exo5 {
    public static void main() {

        double rayon;
        Scanner sc = new Scanner(System.in);
        rayon = sc.nextDouble();
        double surface = Math.PI*(rayon*rayon);

        System.out.println("La surface du cercle est : " + surface);
        //circonférence = 2*Pi*rayon
        double circonference = 2*Math.PI*rayon;
        System.out.println("La circonférence est : " + circonference);

    }
}
