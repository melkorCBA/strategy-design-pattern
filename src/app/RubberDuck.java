package app;

import app.FlyBehavior.FlyNoWay;
import app.QuackBehavior.Squeak;

class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    void display() {
        System.out.println("\nRubber Duck");
    }

}