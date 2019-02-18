import java.util.Scanner;
class fact {
public static void main(String[] args) {
int n,i,f =1; 
Scanner in = new Scanner(System.in);
System.out.println("Enter the number : ");
n = in.nextInt();
for(i=n;i>=1;i--)
{ f = f*i;}
System.out.println("Factorial of "+n+" is " +f);

}
}
