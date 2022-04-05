package assignment7_5;

public class OuterClassOne {

    class InnerClassOfOuterClassOne{
        public InnerClassOfOuterClassOne(String name){ //non-default constructor
            System.out.println("Hello "+name+".Welcome to inner class of outer class one");
        }
    }
}
