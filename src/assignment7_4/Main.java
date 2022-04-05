package assignment7_4;

/*
Create a Cycle interface, with implementations Unicycle, Bicycle and Tricycle.
Create factories for each type of Cycle, and code that uses these factories.
 */

public class Main {
    public static void main(String[] args) {
        CyclesFactory unicycle = new UnicycleFactory();
        unicycle.createCycle().balance();

        CyclesFactory bicycle = new BicycleFactory();
        bicycle.createCycle().balance();

        CyclesFactory tricycle = new TricycleFactory();
        tricycle.createCycle().balance();
    }
}
