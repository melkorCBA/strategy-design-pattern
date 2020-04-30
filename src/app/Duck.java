package app;

import app.FlyBehavior.FlyBehavior;
import app.QuackBehavior.QuackBehavior;

class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    void performFly() {
        flyBehavior.fly();
    }

    void performQuack() {
        quackBehavior.quack();
    }

    void swim() {
        System.out.print(" swims ");
    }

    void display() {
        System.out.print(" Duck ");
    }

}