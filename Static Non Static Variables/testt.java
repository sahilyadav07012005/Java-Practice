class testt 
{
    static testt t1;
    testt t2;
    int x = 101;

    public static void main(String[] args) 
    {
        testt t3;
        System.out.println(t1); 
        System.out.println(testt.t1); 
        System.out.println(new testt().t1); 
        System.out.println(new testt().t2); 

        t3 = t1;
        System.out.println(t3); 
        System.out.println();
        System.out.println("* * * * * * * *");
        System.out.println();

        t1 = new testt();
        System.out.println(t1); 
        System.out.println(t1.t2); 

        t1.t2 = new testt();
        System.out.println(t1.t2); 

        t3 = new testt();
        System.out.println(t3); 
        System.out.println("= = = = = = = = = = =");
        System.out.println(t1.x); 
        System.out.println(t1.t2.x); 
        System.out.println(t3.x); 
    }
}