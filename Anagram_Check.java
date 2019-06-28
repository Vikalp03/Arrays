//Java program to find out whether two strings are anagrams or not.

import java.util.Scanner;

public class Anagram_Check {

    static boolean isAnagram(String a, String b) {
        boolean ret = true;  
        if(a.length()!=b.length()) {
            ret = false;
        }
        else {
            char A[] = a.toLowerCase().toCharArray();
            char B[] = b.toLowerCase().toCharArray();
            java.util.Arrays.sort(A);
            java.util.Arrays.sort(B);
            if(java.util.Arrays.equals(A,B)) {
                 ret = true;
            }
            else {
                 ret = false;
            }
        }
    return ret;
          }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
