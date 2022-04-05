package sailesh.assignment5.data;

/*
Create a class in a package yourname.assignment.data containing an int and a char member variables
that are not initialized, add a method to print these variables. Add another method in the same
class with two local variables and print their values without initializing them.

 */

public class Data {
    int intVariable;
    int charVariable;
    public void printMemberVariables(){
        System.out.println("Value of integer variable : "+intVariable);
        System.out.println("Value of character variable : "+charVariable);
    }
    public void printLocalVariables(){
        int a;
//        System.out.println(a); //we must initialize a local variable
    }
}
