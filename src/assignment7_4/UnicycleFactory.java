package assignment7_4;

public class UnicycleFactory implements CyclesFactory{
    @Override
    public Cycle createCycle() {
        return new Unicycle();
    }
}
