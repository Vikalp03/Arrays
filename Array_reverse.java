import java.util.Scanner;
public class Array_reverse {
    public static void main(String args[]){
        int i, a, j, temp;
        Scanner s  = new Scanner(System.in);
        a = s.nextInt();
        int A[] = new int[a];
        for(i=0;i<a;i++)
        {
            A[i] = s.nextInt();
        }
        
        j = a-1;
        for(i=0;i<a/2;i++,j--)
        {
            temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
        for(i=0;i<a;i++) 
        {
            System.out.print(A[i]+" ");
        }
}
        
}   
    
    
