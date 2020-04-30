package app;

class RubberDuck extends Duck implements Quackable {

    @Override
    public void quack() {
        System.out.print(" quacks ");
    }

    @Override
    void display() {
        System.out.println("\nRubber Duck");
    }

    @Override
    public void add() {
        this.display();
        super.swim();
        this.quack();

    }

}