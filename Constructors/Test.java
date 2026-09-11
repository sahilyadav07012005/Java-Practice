class Test
{
static void Test()
{
System.out.println("Test()method---");
}
Test()
{
System.out.println("Test () constructor--");
}
public static void main(String[]args)
{
Test();
Test.Test();
//new Test().Test();
Test t=new Test();
t.Test();
}
}