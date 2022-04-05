package assignment7_3;

/*
Create three interfaces, each with two methods. Inherit a new interface that combines the three,
adding a new method. Create a class by implementing the new interface and also inheriting from a
concrete class. Now write four methods, each of which takes one of the four interfaces as an
argument. In main( ), create an object of your class and pass it to each of the methods.
 */
public class Main  extends ConcreteClass implements CombinedInterface{

    public void inputMethodForInterfaceOne(InterfaceOne interfaceOne){
        System.out.println("Takes InterfaceOne as argument");
    }

    public void inputMethodForInterfaceTwo(InterfaceTwo interfaceTwo){
        System.out.println("Takes InterfaceTwo as argument");
    }

    public void inputMethodForInterfaceThree(InterfaceThree interfaceThree){
        System.out.println("Takes InterfaceThree as argument");
    }

    public void inputMethodForNewInterface(CombinedInterface combinedInterface){
        System.out.println("Takes NewInterface as argument");
    }

    @Override
    public void methodOfCombinedInterface() {
        System.out.println("method of Combined Interface");
    }

    @Override
    public void methodOneOfInterfaceOne() {
        System.out.println("method one of Interface One");
    }

    @Override
    public void methodTwoOfInterfaceOne() {
        System.out.println("method two of Interface One");
    }

    @Override
    public void methodOneOfInterfaceThree() {
        System.out.println("method one of Interface Three");
    }

    @Override
    public void methodTwoOfInterfaceThree() {
        System.out.println("method two of Interface three");
    }

    @Override
    public void methodOneOfInterfaceTwo() {
        System.out.println("method one of Interface Two");
    }

    @Override
    public void methodTwoOfInterfaceTwo() {
        System.out.println("method two of Interface two");
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.inputMethodForInterfaceOne(main);
        main.inputMethodForInterfaceTwo(main);
        main.inputMethodForInterfaceThree(main);
    }


}
