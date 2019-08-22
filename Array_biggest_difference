//Java program to find out the biggest difference in an array 

import java.io.*;
import java.util.*;
public class Array_biggest_difference {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];

        for(int i=0;i<n;i++) { 
            A[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<n-1;j++) { 
                int temp = A[j];
                if(A[j] > A[j+1]) { 
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }
        
        int diff = A[n-1] - A[0];
        System.out.print(diff);
   }
}
