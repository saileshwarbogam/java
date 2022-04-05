package assignment2;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
Write a java function that checks if the input string contains all the letters of the
alphabet a-z (case-insensitive). Write time and space complexity of your solution
as comments in the source file.
*/

public class Assignment2 {
    public static boolean findLength(String str){
        Set<String> set = new HashSet<>();
        for(String s : str.split("")) {
            set.add(s.toLowerCase());
        }
        return set.size() == 26;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        //ZZXxYyabcdefghijKlmnopqrstuvw
        System.out.println("Enter string : ");
        String str = sc.nextLine();
        System.out.println(findLength(str));
    }
}
