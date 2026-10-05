import java.sql.SQLOutput;
import java.util.*;

public class Exo3 {
    public static void main() {

        System.out.println("Nombre : ");
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        if (n%2==0){
            System.out.println("Nombre pair");
        }else {
            System.out.println("nombre impair");
        }
        String result=(n%2==0)?"nombre pair ":"nombre impair"; //condition sur une ligne
        System.out.println(result);
    }
}
