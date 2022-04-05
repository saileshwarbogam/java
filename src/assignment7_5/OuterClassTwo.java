package assignment7_5;

public class OuterClassTwo extends OuterClassOne{
    class InnerClassOfOuterClassTwo extends OuterClassOne.InnerClassOfOuterClassOne{

        public InnerClassOfOuterClassTwo(String name) {

            super(name);
        }
    }
}