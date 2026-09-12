class Trustme
{
public static void main(String []args){
int a=2;
int b=a++;
System.out.println(a);
System.out.println(b);
int x=10;
int y=++x;
System.out.println(x);
System.out.println(y);
int m=55;
int n=++m+m+++m++;
System.out.println(m);
System.out.println(n);
}
}