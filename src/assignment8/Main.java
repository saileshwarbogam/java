package assignment8;

/*
Error Handling

Create three new types of exceptions. Write a class with a method that throws all three. In main( ),
call the method but only use a single catch clause that will catch all three types of exceptions.
Add a finally clause and verify that your finally clause is executed, even if a NullPointerException is thrown.
 */

public class Main {
    public static void main(String[] args) {
        try{
            User user = new User();
            System.out.println(user.findUserByUserName("Sailesh"));
            System.out.println(user.findUserByCity("Mbnr"));;
            System.out.println(user.findCityByZipCode("509001"));;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Execution completed!");
        }

    }
}
