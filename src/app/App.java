package app;

public class App {
    public static void main(String[] args) throws Exception {
        Duck[] ducks = new Duck[3];
        ducks[0] = new RedHeadDuck();
        ducks[1] = new MallardDuck();
        ducks[2] = new RubberDuck();

        for (Duck duck : ducks) {
            duck.display();
            duck.swim();
            duck.fly();
            duck.quack();

        }

    }
}
