package assignment1;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Create a java program to search through the home directory and look for files that match
a regular expression. The program should be able to take inputs repeatedly
and should print out the full absolute path of the matching files found.
*/
public class Assignment1 {
    public static void findPath(String fileName, File[] fileList) throws IOException {
        Pattern pattern = Pattern.compile(fileName, Pattern.CASE_INSENSITIVE); //defining the pattern
        for (File file : fileList){
           Matcher matcher = pattern.matcher(file.toString()); //searching for pattern
           boolean matchFound = matcher.find();
           if(matchFound){
               System.out.println(file.getAbsolutePath()); //printing path
           }
        }
    }

    public static void main(String[] args) throws IOException {
        File file = new File("/home/saileb/saileshwar"); //creating a file object
        File[] fileList = file.listFiles(); // storing an array of files
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Enter exit to quit");
            System.out.println("Enter file name");
            String fileName = sc.nextLine();
            if(fileName.equals("exit")){
                break;
            }
            findPath(fileName,fileList);
        }
    }
}
