package app;

public class DecoyDuck extends Duck {
    @Override
    void display() {
        System.out.println("\nDecoy Duck");
    }

    @Override
    public void add() {
        this.display();
        super.swim();

    }

}