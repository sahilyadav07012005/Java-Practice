import java.util.Scanner;

class GrossSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter salary of employee:");
        double salary = scanner.nextDouble();
        
        double ta = salary * 0.1; // assuming standard percentage multipliers based on context
        double da = salary * 0.2;
        double hra = salary * 0.3;
        double gross = salary + ta + da + hra;
        
        System.out.println("TA = " + ta);
        System.out.println("DA = " + da);
        System.out.println("HRA = " + hra);
        System.out.println("Gross Salary = " + gross);
        
        scanner.close();
    }
}