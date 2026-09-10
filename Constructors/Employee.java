class Employee 
{
    String ename;
    int empno;
    double esalary;

    void empDetails() 
    {
        System.out.println(ename);
        System.out.println(empno);
        System.out.println(esalary);
    }

    Employee(String ename, int empno, double esalary) 
    {
        this.ename = ename;
        this.empno = empno;
        this.esalary = esalary;
    }

    public static void main(String[] args) 
    {
        Employee e = new Employee("smith", 7894, 800.8);
        e.empDetails();
        System.out.println("----------------");

        Employee e1 = new Employee("Allen", 7788, 950.0);
        e1.empDetails();
        System.out.println("----------------");

        Employee e2 = new Employee("Jones", 9876, 1600.0);
        e2.empDetails();
    }
}