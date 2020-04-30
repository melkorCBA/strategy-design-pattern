package app;

import app.FlyBehavior.FlyWithWings;
import app.QuackBehavior.Quack;

class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("\nRed Head Duck");
    }

}