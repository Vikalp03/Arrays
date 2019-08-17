import java.util.*;

public class Fibonacci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n0=0, n1=1, n2;
        System.out.print("Fibonacci series is: "+n0+" "+n1+" ");
        for(int i=2;i<n;i++) {
            n2 = n0+n1;
            n0=n1;
            n1=n2;
            System.out.print(n2+" ");
        }
    }
}