class Fest
{
static int a=101;
static int b=202;
}
class Demo
{
public static void main(String []args)
{
/*int a=10;
 int b=20;
directly
System.out.println(a);
System.out.println(b);*/
/*by class name
System.out.println(Fest.a);
System.out.println(Fest.b);*/
//by object name 
Fest s=new Fest();
System.out.println(s.a);
System.out.println(s.b);
}
}

