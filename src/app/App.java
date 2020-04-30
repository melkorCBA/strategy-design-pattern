package app;

public class App {
    public static void main(String[] args) throws Exception {
        Duck[] ducks = new Duck[4];
        ducks[0] = new RedHeadDuck();
        ducks[1] = new MallardDuck();
        ducks[2] = new RubberDuck();
        ducks[3] = new DecoyDuck();

        for (Duck duck : ducks) {
            duck.display();
            duck.swim();
            duck.performFly();
            duck.performQuack();

        }

    }
}
