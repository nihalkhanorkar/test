1. WAP to accept 2 numbers from Command line argument and perform its addition and display


public class addtion
 {
public static void main(String args[])
{
String s1 = args [0];
String s2= args [1];

int i=Integer.parseInt(s1);
int j=Integer.parseInt(s2);
int k=i+j;

System.out.println("first argument:" + i );
System.out.println("secound argument:" + j );
System.out.println("trird argument:" + k);
}
}


------------------------------------------------------------------------------------------------------------

2. WAP to accept number from user(Scanner class) print table of it
	5*1=5
	5*2=10
	5*3=15
	5*4=20

import java.util.Scanner;
public class table
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println(" enter number ");
int a=sc.nextInt();
System.out.println("table of "+a);
for(int i=1;i<=4 ;i++)
{
System.out.println(a + "*" + i + "=" + (a*i));
}
}
}






---------------------------------------------------------------------------------------------------------
3.WAP to swap 2 numbers and display it before swap and after swap.

import java.util.*;
import java.lang.*;
public class swapping
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter two nos");

int i=sc.nextInt();
int j=sc.nextInt();

int temp;
System.out.println("i:"+i);
System.out.println("j:"+j);

temp=i;
i=j;
j=temp;
System.out.println("swapping");
System.out.println("i:"+i);
System.out.println("j:"+j);
}
}

-------------------------------------------------------------------------------------------------------------


4.WAP to check whether a number given is even or odd

public class oddeven
{
public static void main(String args[])
{
int a=24;
if(a%2==0)
System.out.println(a+" is even number");
else
System.out.println(a+" is odd number");
}
}




------------------------------------------------------------------------------------------------------------


5.WAP to accept an array and display it in reverse form



import java.util.*;
import java.lang.*;
class reverse
{
public static void main(String[] agrs)
{
	 int i;
	Scanner sc= new Scanner (System.in);
 	System.out.println("enter number");

	int num1[]= new int[5];
	for(i=0;i<num1.length;i++)
	{	

		num1[i]=sc.nextInt();
	}
		for(i=num1.length-1;i>=0;i--)
	{
		System.out.println(num1[i]+" ");
            }
		System.out.println(" ");
}

}


-------------------------------------------------------------------------------------------------------------

6.WAP to illustrate condition operator to find maximum among 2or 3 numbers



-------------------------------------------------------------------------------------------------------------
7.WAP to illustrate example of typecasting 


public intdouble {
  public static void main(String[] args) {
    int a = 9;
    double d = a;

    System.out.println(a);   
    System.out.println(d);   
  }
}

-------------------------------
  //char to int

class charint{  
public static void main(String args[])
{  
char ch ='a';
System.out.println((int)ch);  
}
}  

--------------------------------

-------------------------------------------------------------------------------------------------------------


