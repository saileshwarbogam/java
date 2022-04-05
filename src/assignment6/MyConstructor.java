package assignment6;

/*
Create a class with two (overloaded) constructors. Using this, call the second
 constructor inside the first one.
*/

public class MyConstructor {
    String value1, value2;
    public MyConstructor(String value1){
        this.value1 = value1;
    }
    public MyConstructor(String value1, String value2){
        this(value1); // calling other constructor
        this.value2 = value2;
    }
    public void printValues(){
        System.out.println(value1);
        System.out.println(value2);
    }
    public static void main(String[] args) {
        MyConstructor cons = new MyConstructor("Hello","World!!");
        cons.printValues();
    }
}
