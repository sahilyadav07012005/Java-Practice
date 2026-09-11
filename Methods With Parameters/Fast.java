class Fast
{
    static int a = 101;
    int b = 202;

    int m1() 
    {
        int c = 303;
        System.out.println("m1() method ...");
        return c;
    }

    int m2() 
    {
        System.out.println("m2() method ...");
        return a;
    }

    int m3() 
    {
        System.out.println("m3() method ...");
        return b;
    }

    public static void main(String[] args) 
    {
        Fast t = new Fast();
        t.m1();
        t.m2();
        t.m3();
    }
}