class Swap{
public static void main(String []args){

short A=Short.parseShort(args[0]);
short B=Short.parseShort(args[1]);
short C;

System.out.println("Before swapping");
System.out.println("A="+A);
System.out.println("B="+B);
A=C;
B=A;
C=B;
System.out.println("After swapping");
System.out.println("A="+A);
System.out.println("B="+B);

}
}

