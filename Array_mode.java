//Java program to find out the mode of the numbers in the array

import java.io.*;
import java.util.*;
public class Array_mode {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];

        for(int i=0;i<n;i++) { 
            A[i] = sc.nextInt();
        }
        
        int max = 0, max_value=0;

        for(int i=0;i<n;i++) { 
            int count = 0;
            for(int j=0;j<n;j++) { 
                if(A[j] == A[i]) { 
                    count = count + 1;
                }
            }

            if(count > max) { 
                max = count;
                max_value = A[i];
            }
        }
        System.out.print(max_value);
   }
}
