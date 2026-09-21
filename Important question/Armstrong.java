import java.util.Scanner;

class Armstrong {

    void m1(int num) {
        int m2 = num;
        int sum = 0;

        while (m2 != 0) {
            int Seq = m2 % 10;
            int cube = Seq * Seq * Seq;

            sum = sum + cube;
            m2 = m2 / 10;
        }

        if (sum == num) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        Armstrong A = new Armstrong();
        A.m1(num);
    }
}