import java.util.*;

public class Bubble_sort { 
    public static void main(String args[])  { 
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();


        System.out.println("Enter the array elements: ");
        int A[] = new int[n];
       for(int i=0;i<n;i++){  
            A[i] = sc.nextInt();
        }

        for(int j=0;j<n;j++) {
            for(int i=0;i<n-1;i++) { 
                int temp = A[i];
                if(A[i] > A[i+1]) { 
                    A[i] = A[i+1];
                    A[i+1] = temp;
                }
            }
        }
        System.out.println("Sorted Array is: ");
        for(int i=0;i<n;i++) { 
            System.out.print(A[i]+" ");
        }

    }
}
