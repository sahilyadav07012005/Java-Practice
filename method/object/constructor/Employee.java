class Employee
{
String ename1="Allen";
String ename2="scott";
String ename3="addms";
Employee()
{
System.out.println("Employee() constructor");
}
public static void main(String []args)
{
Employee e=new Employee();
System.out.println("Employee name is"+e.ename1);
System.out.println("Employee name is"+e.ename2);
System.out.println("Employee name is"+e.ename3);
System.out.println("----------------------------");
System.out.println("Employee name is"+ new Employee().ename1);
System.out.println("Employee name is"+ new Employee().ename2);
System.out.println("Employee name is"+ new Employee().ename3);
}
}
