package assignment11;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Using TextFile and a Map<Character,Integer>, create a program that takes the file name as a
command line argument and counts the occurrence of all the different characters. Save the results in a text file.
 */

public class CharacterFrequency {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File(args[0])); //creating a new file instance
        Map<Character, Integer> map = new HashMap<>();
        while(input.hasNext()){
            for(Character s : input.nextLine().toCharArray()){
                if(map.containsKey(s)) map.put(s, map.get(s)+1);
                else map.put(s,1);
            }
        }
        PrintWriter writer = new PrintWriter("/home/saileb/IdeaProjects/Java/src/assignment11/output.txt");
        for(Character s : map.keySet()){
            writer.println(s + " : " + map.get(s));
        }
        writer.close();
    }
}
