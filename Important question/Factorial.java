import java.util.Scanner;
class Factorial {
 void m1(int num) {
 int fact = 1;
 for (int i = 1; i <= num; i++)
 fact = fact * i;
 System.out.println("Factorial = " + fact);
 }
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter number: ");
 int num = sc.nextInt();
 Factorial f = new Factorial();
 f.m1(num);
 }
}