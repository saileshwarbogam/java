package assignment6;

/*
Create a class with a constructor that takes a String argument. During construction,
 print the argument. Create an array of object references to this class,
 but don’t actually create objects to assign into the array.
 When you run the program, notice whether the initialization messages
 from the constructor calls are printed.

 */


public class MyConstructor2 {
    public MyConstructor2(String value){
        System.out.println(value);
    }

    public static void main(String[] args) {
        MyConstructor2 objectArray[] = new MyConstructor2[2];// creating object references to the class
        objectArray[0] = new MyConstructor2("Hello");
        objectArray[1] = new MyConstructor2("World!!");
    }
}
