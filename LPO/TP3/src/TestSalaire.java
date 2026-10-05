public class TestSalaire {
    public static void main(String[] args) {
        Employe moi = new Employe();
        moi.initialise("Hugo", 55.25f);

        moi.travail(10);
        moi.travail(8);

        System.out.println("Salaire : "+moi.salaire());
        moi.demandeAcompte();
        System.out.println("Salaire : "+moi.salaire());
        moi.demandeAcompte();
        System.out.println("Salaire : "+moi.salaire());
    }
}
