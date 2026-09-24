class Super{
    public void display()
    {
        System.out.println("i am a  Person");
    }
}
class Fest extends Super{
    public static void main(String[] args) {
        Fest F=new Fest();
        F.display();
    }
}