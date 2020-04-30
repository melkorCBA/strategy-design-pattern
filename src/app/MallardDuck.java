package app;

import app.FlyBehavior.FlyWithWings;
import app.QuackBehavior.Quack;

class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("\nMallard Duck");
    }

}