package app;

class RubberDuck extends Duck {

    @Override
    void display() {
        System.out.println("\nRubber Duck");
    }

    @Override
    public void fly() {
        // do nothing
    }

}