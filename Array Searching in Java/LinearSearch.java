import java.util.Scanner;
class Lsearch {
public static void main(String[] args) {
int A[],n,i,a,flag=0;
Scanner in = new Scanner(System.in);
System.out.println("Enter the number of elements of the array : ");
n = in.nextInt();
A = new int[n];
System.out.println("\nInput the elements of the array : ");
{ for(i=0;i<n;i++)
A[i] = in.nextInt();
}
System.out.println("\nNow the array is : ");
for(i=0;i<n;i++) {
System.out.println("\n"+A[i]);
}
System.out.println("Enter the element you want to search for : ");
a = in.nextInt();
for(i=0;i<n;i++)
{ if(A[i] == a)
  { flag = 1;	
    break;
  }
}
if(flag == 1)
{ System.out.println("\nElement "+a+ " is located at the index number "+i);
}
else
{ System.out.println("\nElement "+a+ " is not found in the array");
}
}
}

