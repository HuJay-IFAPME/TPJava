public class Stack{

    private int top;
    private int[] pile;

    public Stack(int taille) {
        this.top = -1;
        this.pile = new int[taille];
    }

    public void push(int value){
        if (isFull())
            System.out.println("La pile est pleine");
        else
            top++;
            pile[top] = value;
    }

    public void pop(){
        if (isEmpty())
            System.out.println("La pile est vide");
        else
            top--;
    }

    public boolean isEmpty(){
        if (top == -1)
            return true;
        else
            return false;
    }

    public boolean isFull(){
        if (top == pile.length)
            return true;
        else
            return false;
    }

    public void display(){
        for (int i=0; i<=top; i++)  // top plutôt que pile.length, sinon affiche des 0 pour les cases non remplies.
            System.out.println(pile[i]);
    }
}