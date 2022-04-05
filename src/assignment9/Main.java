package assignment9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Using the documentation for java.util.regex.Pattern as a resource, write and test a regular expression
that checks a sentence to see that it begins with a capital letter and ends with a period.
 */
public class Main {
    public static boolean beginsWithCapitalEndsWithPeriod(String sentence){
        Pattern pattern = Pattern.compile("[A-Z].*\\.");
        Matcher matcher = pattern.matcher(sentence);
        if(matcher.find()) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence : ");
        String sentence = sc.nextLine();
        if(beginsWithCapitalEndsWithPeriod(sentence)){
            System.out.println("Match found ✔");
        }
        else{
            System.out.println("Match not found ✘");
        }
    }
}
