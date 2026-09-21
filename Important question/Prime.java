import java.util.Scanner;
class Prime {
 void m1(int num) {
 int count = 0;
 for (int i = 1; i <= num; i++) {
 if (num % i == 0)
 count++;
 }
 if (count == 2)
 System.out.println("Prime Number");
 else
 System.out.println("Not Prime Number");
 }
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter number: ");
 int num = sc.nextInt();
 Prime p = new Prime();
 p.m1(num);
 }
}
