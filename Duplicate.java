import java.util.*;

public class Duplicate {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] A = new int[n];
        for(int i=0;i<n;i++) { 
            A[i] = in.nextInt();
        }

        for(int i=0;i<n;i++) {
            for(int j = i+1; j<n; j++) { 
                if(A[j] == A[i]) { 
                System.out.println(A[j]);
                }
            }
        }

    }
}
