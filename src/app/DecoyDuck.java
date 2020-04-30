package app;

import app.FlyBehavior.FlyNoWay;
import app.QuackBehavior.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    void display() {
        System.out.println("\nDecoy Duck");
    }

}