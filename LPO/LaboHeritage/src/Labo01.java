public class Labo01 {
    public static void main(String[] args) {
        Employe e = new Employe("Machin", "EMP-101", 2500);
        Manager m = new Manager("Truc", "MNG-201", 3500);

        e.afficherInfos();
        m.afficherInfos();

    }
}
