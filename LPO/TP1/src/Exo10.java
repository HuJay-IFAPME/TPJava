import java.util.*;

public class Exo10 {
    public static void main() {

        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Âge :");
        age = sc.nextInt();
        System.out.println("Sexe (true=h, false=f) :");
        boolean sexe = sc.nextBoolean();

        if (sexe == true){
            if (age>=25){
                System.out.println("Vétéran");
            } else if (age>=16) {
                System.out.println("Senior");
            }else{
                System.out.println("Espoir homme");
            }
        }else{
            if (age>=25){
                System.out.println("Ainée");
            } else if (age>=16) {
                System.out.println("Seniore");
            }else{
                System.out.println("Espoir dame");
            }
        }

        if (age<=15){
            System.out.println((sexe)?"Espoir dame":"Espoir homme");
        } else if (age<=24){
            System.out.println((sexe)?"Senior dame":"Senior homme");
        }else{
            System.out.println((sexe)?"Vétéran dame":"Vétéran homme");
        }

        sc.close();
    }
}
