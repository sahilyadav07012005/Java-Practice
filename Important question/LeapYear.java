import java.util.Scanner;

class LeapYear {

    void m1(int year) {
        if (year % 400 == 0) {
            System.out.println("Leap Year");
        } 
        else if (year % 100 == 0) {
            System.out.println("Not Leap Year");
        } 
        else if (year % 4 == 0) {
            System.out.println("Leap Year");
        } 
        else {
            System.out.println("Not Leap Year");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        LeapYear L = new LeapYear();
        L.m1(year);
    }
}