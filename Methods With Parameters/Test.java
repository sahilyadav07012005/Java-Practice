class X { }
class Y { }
class Emp { }
class Student { }
class sahil { }
class samyak { }

class Test
{
    void m1(X x, Y y)
    {
        System.out.println("m1() method--");
        System.out.println("=======");
        System.out.println("The value of x=" + x);
        System.out.println("The value of y=" + y);
    }
    
    void m2(Emp e, Student s)
    {
        System.out.println("m2() method....");
        System.out.println("=======");
        System.out.println("The value of e=" + e);
        System.out.println("The value of s=" + s);
    }
    
    void m3(sahil moon, samyak college)
    {
        System.out.println("m3() method --");
        System.out.println("=======");
        System.out.println("The value of moon=" + moon);
        System.out.println("The value of college=" + college);
    }
    
    public static void main(String[] args)
    {
        Test t = new Test();
        
        // Pass new objects of the required classes to match the method signatures
        t.m1(new X(), new Y());
        t.m2(new Emp(), new Student());
        t.m3(new sahil(), new samyak());
    }
}