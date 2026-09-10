class Fest
{
void m1(int x,int y)
{
System.out.println("m1()method");
System.out.println("-------------");
System.out.println("Addition="+(x+y));
}
public static void main(String []args)
{
Fest f=new Fest();
f.m1(10,20);
System.out.println();
int a=100,b=200;
f.m1(a,b);
System.out.println();
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.println("enter the value of parameter:");
int num1=sc.nextInt();
int num2=sc.nextInt();
f.m1(num1,num2);
}
}
