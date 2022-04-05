package assignment6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
A vampire number v is a number with an even number of digits n, that can be factored into two
numbers x and y each with n/2 digits and not both with trailing zeroes, where v contains precisely
all the digits from x and from y, in any order. Write a java program to print first 100 vampire numbers.
*/

public class VampireNumber {
    public static boolean checkForSameDigits(int num, int x){
        for(int k=num;k>0;k/=10){
            int c1=0, c2=0;
            for(int p=num;p>0;p/=10){
                if(k%10 == p%10) c1++;
            }
            for(int p=x;p>0;p/=10){
                if(k%10 == p%10) c2++;
            }
            if(c1!=c2) return false;
        }
        return true;
    }
    public static boolean isVampireNumber(int num){
        int digitCount=0, flag=0;
        for(int i=num; i>0;i/=10) digitCount++;
        if(digitCount % 2 != 0){
            return false;
        }
        for(int i=(int)Math.pow(10,digitCount/2-1); i<(int)Math.pow(10,digitCount/2);i++ ){
            if(num%i ==0){ //i is a factor
                int j = num/i; //then j is another factor
                if(!(j>=Math.pow(10,digitCount/2-1) && j<Math.pow(10,digitCount/2))) continue;
                int x = i*(int)Math.pow(10,digitCount/2)+j; // number formed using factors
                if(i%10 == 0 && j%10 == 0) continue; //checking for trailing zeroes
                else{
                    if(checkForSameDigits(num,x)) { //checking for same number of digits
                        flag = 1;
                        break;
                    }
                }
            }
        }
        if(flag==1) return true;
        else return false;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int start=1260, count=0;
        while(true){
            if(isVampireNumber(start)){
                list.add(start);
                count++;
            }
            if(count ==100) break;
            start++;
        }

        System.out.println(Arrays.toString(list.toArray()));
    }
}
