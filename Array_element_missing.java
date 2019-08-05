import java.util.*;

public class Array_element_missing { 
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n, i, A[], sum;
        System.out.println("Enter the number of elements in the array: ");
        n = in.nextInt();
        System.out.println("Enter the elements of the array: ");
        A = new int[n];
        for(i=1;i<n;i++) {
            A[i] = in.nextInt();
        }
   
        sum = n*(n+1)/2;
        for(i=1;i<n;i++) { 
            sum = sum - A[i];
        }
        System.out.println("The missing number is: "+sum);
        
    }
}