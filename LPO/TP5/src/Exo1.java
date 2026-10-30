public class Exo1 {
    private String nom;
    private int age;

    public Exo1(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public void comparerAge(Exo1 p2){
        if (this.age < p2.age){
            System.out.println(this.nom+" est plus jeune que "+p2.nom);
        }else System.out.println(this.nom+" est plus âgé que "+p2.nom);
    }
}
