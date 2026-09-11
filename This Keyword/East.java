class East 
{
    East m1() 
    {
        System.out.println("m1() method ...");
        East t = new East();
        return t;
    }

    static East m2() 
    {
        System.out.println("m2() method ...");
        return new East();
    }

    East m3() 
    {
        System.out.println("m3() method ...");
        return this;
    }

    public static void main(String[] args) 
    {
        East obj = new East();
        
        East x = obj.m1();
        System.out.println("m1() method returns value =" + x);
        System.out.println();

        East y = East.m2();
        System.out.println("m2() method returns value =" + y);
        System.out.println();

        East z = obj.m3();
        System.out.println("M3() method returns value =" + z);
    }
}