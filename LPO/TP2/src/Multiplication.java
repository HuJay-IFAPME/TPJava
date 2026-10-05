import java.util.*;

public class Multiplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int multiple;
        int result;

        while (true) {
            System.out.println("Entrez un nombre : ");
            int nb = sc.nextInt();

            if (nb == 0){
                break;
            }

            for (multiple = 1; multiple < 11; multiple++) {
                result = nb * multiple;
                System.out.println(multiple + " x " + nb + " = " + result);
            }
        }
        sc.close();
    }
}
