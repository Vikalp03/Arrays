import java.util.Scanner;
class AddMatrix {
public static void main(String[] args)
{
int i,j,r,c,A[][],B[][],C[][];
Scanner in = new Scanner(System.in);
System.out.println("****We are doing addition of two matrices*****");
 System.out.println("\nEnter the rows and columns of matrices : ");
r = in.nextInt();
c = in.nextInt();
A = new int[r][c];
B = new int[r][c];
C = new int[r][c];
System.out.println("\nEnter the elements of I matrix : ");
for(i=0;i<r;i++)
   { for(j=0;j<c;j++)
      { 
          A[i][j] = in.nextInt();
      }
   }
System.out.println("\nEnter the elements of II matrix : ");
for(i=0;i<r;i++)
   {  for(j=0;j<c;j++)
      {  
         B[i][j] = in.nextInt();
      }
   }
System.out.println("\nThe I matrix is as follows :- ");
for(i=0;i<r;i++)
 { for(j=0;j<c;j++)
   { System.out.print(A[i][j]+ "\t");
   }
 System.out.println("\n");  
 }
System.out.println("\nThe second matrix is as follows :- ");
for(i=0;i<r;i++)
 { for(j=0;j<c;j++)
   { System.out.print(B[i][j]+ "\t");
   }
 System.out.println("\n");
 } 
System.out.println("\nNow the addition of these matrices is as follows :- ");
for(i=0;i<r;i++)
  {  for(j=0;j<c;j++)
     {  
        C[i][j] = A[i][j] + B[i][j];
        System.out.print(C[i][j]+"\t");
     }
     System.out.println("\n");
      
  }
}
}
