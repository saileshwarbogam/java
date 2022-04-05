package sailesh.assignment5.singleton;

/*
Create another class in package yourname.assignment.singleton containing a non static String member variable.
Add a static method that takes String as parameter and initialize the member variable and then return
object of that class. Add a non static method to print the String.
 */

public class Singleton {
    String stringVariable;
    public static Singleton setString(String str){
        Singleton singleton = new Singleton();
        singleton.stringVariable = str;
        return singleton;
    }
    public void printString(){
        System.out.println("Value of string variable :  "+stringVariable);
    }
}
