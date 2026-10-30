import java.util.*;

public class TestExo3 {
    public static void main(String[] args) {
        ArrayList<Integer> factures = new ArrayList<Integer>();
        Exo3 client1 = new Exo3("Machin", factures);

        factures.add(816);
        client1.moyenne();
        factures.add(345);
        client1.moyenne();
    }
}
