package assignment7_2;

/*
Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle. Add a balance( )
 method to Unicycle and Bicycle, but not to Tricycle. Create instances of all three
 types and upcast them to an array of Cycle. Try to call balance( ) on each element of
 the array and observe the results. Downcast and call balance( ) and observe what happens.

 */


public class Main {
    public static void main(String[] args) {
        Cycle cycles[] = new Cycle[3];

        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();


        System.out.println("Upcasting");//child object is typecasted to a parent object
        cycles[0] =unicycle;
        cycles[1] = bicycle;
        cycles[2] = tricycle;
        for (Cycle cycle:cycles){
            cycle.balance();
        }


        System.out.println("Downcasting");
        unicycle = (Unicycle)cycles[0];
        bicycle = (Bicycle)cycles[1];
        tricycle = (Tricycle)cycles[2];
        unicycle.balance();
        bicycle.balance();
        tricycle.balance();

    }
}
