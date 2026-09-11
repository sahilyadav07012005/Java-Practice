class Employee
{
String name="padhai";
static String job="chor";
void empDetails (double salary)
{
char gender='m';
System.out.println("Employee salaray is:"+salary);
System.out.println("Emplyoee Gender is:"+gender);
}
public static void main(String []args)
{
Employee e=new Employee ();
System.out.println("Employee name is:"+e.name);
System.out.println("Employee job is"+Employee.job);
e.empDetails(10000);
}
}
