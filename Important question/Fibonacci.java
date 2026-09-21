import java.util.Scanner;

class Fibonacci {

    void m1(int count) {
        int a = 0;
        int b = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= count; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int count = sc.nextInt();

        Fibonacci f = new Fibonacci();
        f.m1(count);
    }
}