class Left
{
static int x=10;
int y=20;
public static void main(String []args)
{
Left t1=new Left();
Left t2=new Left();
Left t3=new Left();
System.out.println(t1.x+"___"+t2.x+"_______"+t3.x);
System.out.println(t1.y+"___"+t2.y+"_______"+t3.y);
t1.x=111;
t2.x=222;
t3.x=333;
t1.y=999;
t2.y=888;
t3.y=777;
System.out.println(t1.x+"___"+t2.x+"_______"+t3.x);
System.out.println(t1.y+"___"+t2.y+"_______"+t3.y);
}
}