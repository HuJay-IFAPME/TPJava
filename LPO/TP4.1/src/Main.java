public class Main {
    public static void main(String[] args) {

        Stack pile = new Stack(5);

        System.out.println("Pile vide : "+pile.isEmpty());
        pile.push(10);
        pile.push(20);
        pile.push(30);
        System.out.println("Pile vide : "+pile.isEmpty());
        System.out.println("Pile pleine : "+pile.isFull());
        pile.display();
        pile.pop();
        pile.display();
        pile.push(40);
        pile.push(50);
        System.out.println("Pile pleine : "+pile.isFull());
        pile.display();
    }
}