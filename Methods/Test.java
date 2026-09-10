class Test
{
void show(int a,int b)
{
System.out.println("show()method---");
System.out.println("-----------");
System.out.println(a+"------"+b);
}
static void display(String s,double d,boolean b)
{
System.out.println("display()method");
System.out.println("--------------");
System.out.println(s+"-----------"+d+"----------"+b);
}
void fun(char ch,short s,float f)
{
System.out.println("fun()method");
System.out.println("-------------------");
System.out.println(ch+"------"+s+"----------"+f);
}
public static void main(String []args)
{
Test t=new Test();
t.show('b',(byte)10);
System.out.println();
Test.display("moon",5.4,true);
System.out.println();
t.fun('k',(short)120,6.7f);
}
}