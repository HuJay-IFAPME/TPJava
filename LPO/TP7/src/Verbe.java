import java.util.*;

public class Verbe {
    protected String leVerbe;

    public Verbe() {
        Scanner sc = new Scanner(System.in);
        String verbe = sc.nextLine();

        while (!verbe.toLowerCase().endsWith("er")){
            System.out.println("Le verbe ne termine pas par 'ER', donnez-en un autre : "+sc.nextLine());
            verbe = sc.nextLine();
        }
            this.leVerbe = verbe.toLowerCase();
    }

    public String getVerbe() {
        return leVerbe;
    }
}