class Fest
{
void add(int x,int y)
{
System.out.println("sum is "+(x+y));
}
void sub(int x,int y)
{
System.out.println("sub is "+(x-y));
}
void mult(int x,int y)
{
System.out.println("mult is "+(x*y));
}
void div(float x,float y)
{
System.out.println("div is "+(x/y));
}
void mod(int x,int y)
{
System.out.println("mod is "+(x%y));
}




public static void main(String []args)
{
Fest f=new Fest();
f.add(7,77);

System.out.println("");
f.sub(9,6);
System.out.println("");
f.mult(9,9);
System.out.println("");
f.div(9,6);
System.out.println("");
f.mod(7,6);



}
}



