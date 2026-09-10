class EmpDetails
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee name:");
        String ename = sc.nextLine();

        System.out.println("Enter Employee id:");
        int eid = sc.nextInt();

        System.out.println("Enter Employee Salary:");
        double esalary = sc.nextDouble();

        System.out.println("Enter Employee Gender:");
        char gender = sc.next().charAt(0);

        System.out.println("Employee Name = " + ename);
        System.out.println("Employee Id = " + eid);
        System.out.println("Employee Salary = " + esalary);
        System.out.println("Employee Gender = " + gender);
    }
}