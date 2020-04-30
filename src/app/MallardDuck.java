package app;

class MallardDuck extends Duck implements Flyable, Quackable {

    @Override
    public void quack() {
        System.out.print(" quacks ");
    }

    @Override
    public void fly() {
        System.out.print(" flies ");
    }

    @Override
    void display() {
        System.out.println("\nMallard Duck");
    }

    @Override
    public void add() {
        this.display();
        super.swim();
        this.quack();
        this.fly();

    }

}