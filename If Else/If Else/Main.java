import java.util.Scanner;
public class Main
{
public static void main(String []args)
{
Scanner SC=new Scanner(System.in);
System.out.println("enter 2 no:");
int x = SC.nextInt();
int y = SC.nextInt();
if(x+y>20)
{
System.out.println("x+y is greater than 20");
}
else
{
System.out.println("x+y is less than 20");
}
}
}