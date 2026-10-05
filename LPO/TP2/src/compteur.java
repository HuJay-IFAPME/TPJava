public class compteur {
    public static void main(String[] args) {

        for (int chrono = 0; chrono <= 180; chrono++) {
            System.out.printf(" %2d minute(s) %02d seconde(s) %n", chrono / 60, chrono % 60);

            // ajout d'un try / catch pour forcer la pause d'une seconde.
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("fin du chrono");
                break;
            }
        }
        System.out.println("fin du chrono");
    }
}
