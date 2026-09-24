class Super{
    public void display()
    {
        System.out.println("Hello Word");
    }
}
class Sub extends Super{
    public static void main(String[] args) {
        Sub M=new Sub();
        M.display();
    }
}