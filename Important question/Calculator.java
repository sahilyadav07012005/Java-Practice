import java.util.Scanner;

class Calculator {

    void m1(int a, int b, char op) {
        if (op == '+') {
            System.out.println(a + b);
        } 
        else if (op == '-') {
            System.out.println(a - b);
        } 
        else if (op == '*') {
            System.out.println(a * b);
        } 
        else if (op == '/') {
            System.out.println(a / b);
        } 
        else {
            System.out.println("Wrong operator");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter operator: ");
        char op = sc.next().charAt(0);

        Calculator c = new Calculator();
        c.m1(a, b, op);
    }
}