class Student
{
static int roll=101;
static double mark;
void m1()
{
Student s = new Student();
System.out.println(roll+"__"+Student.roll+"____"+s.roll);
System.out.println(mark+"__"+Student.mark+"____"+s.mark);
}
public static void main(String []args)
{
Student s=new Student();
System.out.println(roll+"__"+Student.roll+"____"+s.roll);
System.out.println("______");
s.m1();
}
}

