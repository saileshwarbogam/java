package assignment7_5;

/*
Create a class with an inner class that has a non-default constructor (one that takes arguments).
Create a second class with an inner class that inherits from the first inner class.

 */

public class Main {
    public static void main(String[] args) {
        OuterClassTwo outer = new OuterClassTwo();
        OuterClassTwo.InnerClassOfOuterClassTwo innerObject = outer.new InnerClassOfOuterClassTwo("Sailesh");
    }
}
