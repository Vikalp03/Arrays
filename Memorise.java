//In this Game , your team will be shown N numbers for few minutes . You will have to memorize these numbers.
//Now, the questioner will ask you Q queries, in each query He will give you a number , and you have to tell him the total number of occurrences of that number in the array of numbers shown to your team . If the number is not present , then you will have to say “NOT PRESENT” (without quotes).

import java.util.*;

public class Memorise { 
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];
        
        for(int i=0;i<n;i++) { 
            A[i] = sc.nextInt();
        }
        
        int q = sc.nextInt();
        
        int B[] = new int[q];
        for(int i=0;i<q;i++) { 
            B[i] = sc.nextInt();            
        }
        
        for(int i=0;i<q;i++){ 
            int count = 0;         
              for(int j=0;j<n;j++) { 
                if(B[i] == A[j]) {
                    count = count + 1;
                }
            }
            if(count == 0) { 
                System.out.println("NOT PRESENT");
            }
            else {
                System.out.println(count);
            }
        }
    }
}
