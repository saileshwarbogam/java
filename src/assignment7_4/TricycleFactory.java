package assignment7_4;

public class TricycleFactory implements CyclesFactory{

    @Override
    public Cycle createCycle() {
        return new Tricycle();
    }
}
