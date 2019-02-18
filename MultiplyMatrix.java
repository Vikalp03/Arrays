import java.util.Scanner;
class MultiplyMatrix {
public static void main(String[] args) {
int r1,c1,r2,c2,A[][],B[][],C[][],i,j,k;
Scanner in = new Scanner(System.in);
System.out.println("*******We are doing matrix multiplication*******");
System.out.println("\nEnter rows and columns of I matrix : ");
r1 = in.nextInt();
c1 = in.nextInt();
A = new int[r1][c1];
System.out.println("\nEnter rows and columns of II matrix : ");
r2 = in.nextInt();
c2 = in.nextInt();
B = new int[r2][c2];
if(c1 != r2)
 {  System.out.println("\nSorry Dude!...Matrix multiplication is not possible");
 }
else
{ System.out.println("\nEnter the elements of I matrix : ");
  for(i=0;i<r1;i++)
  {  for(j=0;j<c1;j++)
     A[i][j] = in.nextInt();
  }
 System.out.println("\nEnter the elements of II matrix : ");
 for(i=0;i<r2;i++)
 {  for(j=0;j<c2;j++)
    B[i][j] = in.nextInt();
}
System.out.println("\nThe I matrix is as follows : ");
for(i=0;i<r1;i++)
 { for(j=0;j<c1;j++)
  { System.out.print(A[i][j]+ "\t");
  }
 System.out.print("\n");
 }
System.out.println("\nThe II matrix is as follows : ");
for(i=0;i<r2;i++)
 { for(j=0;j<c2;j++)
  { System.out.print(B[i][j]+ "\t");
  }
 System.out.print("\n");
 }
C = new int[r1][c2];
for(i=0;i<r1;i++)
 {  for(j=0;j<c2;j++)
   {   C[i][j] = 0; 
       for(k=0;k<r2;k++)
       {  C[i][j] = C[i][j] + A[i][k]*B[k][j];
      }
  }
}
System.out.println("\nThe multiplication of these two matrices is as follows :- ");
for(i=0;i<r1;i++)
 {  for(j=0;j<c2;j++)
   {  System.out.print(C[i][j]+ "\t");
   }
System.out.println("\n");
}
}
}
}



