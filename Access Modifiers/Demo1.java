class Test2{
public static int a=10;
protected static int b=20;
static int c=30;
private static int d=40;
}
class Demo1
{
public static void main(String []args)
{
System.out.println(Test2.a);
System.out.println(Test2.b);
System.out.println(Test2.c);
//System.out.println(Test2.d);d has private
}
}
