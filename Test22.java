class Test22
{
int x=10;
int y=0;
void m1()
{
Test22 t=new Test22();
System.out.println(t.x);
System.out.println(x);
System.out.println(y+"__"+t.y);
}
public static void main(String []args)
{
Test22 t=new Test22();
System.out.println(t.x);
t.m1();
}
}