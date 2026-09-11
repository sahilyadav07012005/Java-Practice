abstract class testt
{
    abstract void m1();

    void m2()
    {
        System.out.println("m2() method");
    }

    public static void main(String[] args)
    {
        testt obj1 = new testt()
        {
            void m1()
            {
                System.out.println("m1() method");
            }
        };

        testt obj2 = new testt()
        {
            void m1()
            {
                System.out.println("m1() method");
            }
        };

        obj1.m1();
        obj1.m2();

        obj2.m1();
        obj2.m2();
    }
}