import java.util.*;

public class Conjugaison {

    static final String[] sujet = {"je", "tu", "iel", "nous", "vous", "iels"};
    static final String[] terminaison = {"e", "es", "e", "ons", "ez", "ent"};

    public static void affichePresent(Verbe v){
        String leVerbe = v.getVerbe();
        for (int i = 0; i < sujet.length; i++) {
            for (i = 0; i < terminaison.length; i++) {
                System.out.println(sujet[i]+" "+leVerbe.substring(0, leVerbe.length() - 2)+terminaison[i]);
            }
        }
    }

}
