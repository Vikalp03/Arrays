import java.util.Scanner;
class Bsearch {
public static void main(String args[]) {
int A[],n,i,a,beg,last,mid;
Scanner in = new Scanner(System.in);
System.out.println("So now we are going to do a binary search on an array and for doing that we");
System.out.println("have to enter the elements of the array in the sorted order i.e. ascending or descending");
System.out.println("Enter the number of elements in the array : ");
n = in.nextInt();
A = new int[n];
System.out.println("\nEnter the elements of the array : ");
for(i=0;i<n;i++)
  {  A[i] = in.nextInt();
  }
System.out.println("\nEnter the element you want to search in the array : ");
a = in.nextInt();
beg = 0;
last = n-1;
mid = (beg + last)/2;
while(beg<=last)
 {   if(A[mid] == a)
    { 
        System.out.println("\nElement "+a+ " is located at index number "+mid);
        break;
    }
else if(A[mid]<a)
    { beg = mid + 1; }
else 
    { last = mid - 1; }
 mid = (beg + last)/2;
}
if(beg>last)
{ 
  System.out.println("\nElement "+a+ " is not found in the array");
}
}
}
