class Test23 {
void Test19(int k)
{
int a=10;
System.out.println(a);
int b;
//System.out.println(b);
System.out.println(k);
}
Test23()
{
int b=20;
System.out.println(b);
//System.out.println(a);
}
Static Test23()
{
int c=30;
}
}
class Test19{
void m1()
{
int c=200;
int a=10;
//System.out.println(a);
System.out.println(c);
}
public static void main(String []args)
{
Test19 t=new Test19();
t.m1(100);
}
}
class Test19
{
void m1(int a)
{
int b=10;
int c=30;
System.out.println(a+"___"+b+"____"+c);
System.out.println(Test19.b);
Test19 t=new Test19();
//System.out.println(t.b);
}
public static void main(String []args)
{
int d=90;
//System.out.println(b);
System.out.println(d);
int e;
//System.out.println(e);
Test19 t=new Test19();
t.m1(300);
}
}
