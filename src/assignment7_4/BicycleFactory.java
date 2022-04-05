package assignment7_4;

public class BicycleFactory implements CyclesFactory{
    @Override
    public Cycle createCycle() {
        return new Bicycle(); //creating object without exposing the creation logic
    }
}
