//Program to find out the Lexicographical smallest and largest substring of length 'k' in a string. 

import java.util.Scanner;

public class Lex_String {

    public static String getSmallestAndLargest(String s, int k) {
        String substr = s.substring(0, k);
        String smallest = substr;
        String largest = substr;
        
        for(int i=k;i<s.length();i++) {
            substr = substr.substring(1,k) + s.charAt(i);
            if(largest.compareTo(substr) < 0){
                largest = substr;
            }
            if(smallest.compareTo(substr) > 0) {
                smallest = substr;
            }
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
