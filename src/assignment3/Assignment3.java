package assignment3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/*
Write a java function that will ping any host ( given as input ) and computes
the median of the time taken to ping.
*/


public class Assignment3 {
    public static float getMedian(String command, int packets) {
        List<Float> time = new ArrayList<>();
        int count = 0;
        try {
            Process p = Runtime.getRuntime().exec(command+" -c "+packets);
            BufferedReader inputStream = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String s = "";
            while ((s = inputStream.readLine()) != null) {
                System.out.println(s);
                count++;
                if(count == packets+2) break;
                if(count == 1) continue;
                List<String> wordList = Arrays.asList(s.split(" "));
                time.add(Float.parseFloat(wordList.get(wordList.size()-2).split("=")[1]));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Collections.sort(time);
        System.out.println(Arrays.toString(time.toArray()));
        if(time.size()%2 != 0){
            return time.get(time.size()/2);
        }
        return (time.get(time.size()/2 - 1)+time.get(time.size()/2))/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter host address : ");
        String host = sc.nextLine();
        System.out.println("Enter number of packets : ");
        int packets = sc.nextInt();
        System.out.println(getMedian("ping " + host, packets));;
    }
}