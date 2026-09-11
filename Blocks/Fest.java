class Fest
{
    Fest()
    {
        System.out.println("Fest() constructor");
    }

    static
    {
        System.out.println("Static block-1");
    }

    {
        System.out.println("Non-static block-1");
    }

    void add(int a, int b)
    {
        System.out.println("Addition = " + (a + b));
    }

    public static void main(String[] args)
    {
        System.out.println("main() method execution");

        Fest f = new Fest();
        f.add(100, 200);
    }

    static
    {
        Fest f = new Fest();
        f.add(111, 222);

        System.out.println("Static block-2");
    }

    {
        System.out.println("Non-static block-2");
    }
}