import java.util.Scanner;

class Palindrome {

    void m1(int num) {
        int temp = num;
        int reverse = 0;

        while (temp != 0) {
            int digit = temp % 10;

            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }

        if (reverse == num) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not Palindrome Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        Palindrome p = new Palindrome();
        p.m1(num);
    }
}