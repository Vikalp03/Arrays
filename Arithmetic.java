import java.util.Scanner;
class Operation { 
public static void main(String[] args){
int ch;
Scanner in = new Scanner(System.in);
System.out.println("So today we are going to do arithmetic operations through Java programming :- ");
System.out.println("\n1. Addition");
System.out.println("\n2. Subtraction");
System.out.println("\n3. Multiplication");
System.out.println("\n4. Division");
System.out.println("\nEnter your choice : ");
ch = in.nextInt();
System.out.println("\nOkay, so you want to do operation no. "+ch);
switch(ch)
  { 
   case 1 : int a,b,c;
                   System.out.println("\nEnter two numbers : ");
                   a = in.nextInt();
                   b = in.nextInt();
                   c = a + b;
                   System.out.println("\nThe Result is : " +c);
                   break; 
   case 2 :  
                  System.out.println("\nEnter two numbers : ");
                  a = in.nextInt();
                  b = in.nextInt();
                  c = a - b;
                  System.out.println("\nThe Result is : "+c);
                  break;
   case 3 : 
                 System.out.println("\nEnter two numbers : ");
                 a = in.nextInt();
                  b = in.nextInt();
                  c = a * b;
                  System.out.println("\nThe Result is : " +c);
                 break;
  case 4 : int p,q;
                float r;
                 System.out.println("\nEnter two numbers : ");
                  p = in.nextInt();
                  q = in.nextInt();
                 if(q == 0)
                   { System.out.println("\nSorry buddy!....Division is not possible");
                   } 
                 if(p>q)
                   {  r = p/q;
                      System.out.println("\nThe Result is : " +r);
                   }
                 else 
                 { System.out.println("\nSorry buddy!.....Division is not possible");
                  }
                  break;
default : System.out.println("\nOh Come On Dude make some appropriate choice");
}
System.out.println("\nThank you so much buddy for doing Java Programming........");
}
}

