package app.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.print(" Quacks ");
    }
}