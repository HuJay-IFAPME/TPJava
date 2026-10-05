import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class jeu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final byte PRIX = 34;
        byte NBproposition = 1;

        while (NBproposition < 9) {
            System.out.println("Devinez le prix :");
            byte proposition = sc.nextByte();

            if (proposition<PRIX){
                System.out.println("TROP PETIT...");
                NBproposition++;
            } else if (proposition>PRIX) {
                System.out.println("TROP GRAND...");
                NBproposition++;
            }else {
                System.out.println("GAGNÉ !");
                break;
            }
        }
        if (NBproposition > 8){
            System.out.println("PERDU ! Le prix était : " + PRIX);
        }
    }
}
