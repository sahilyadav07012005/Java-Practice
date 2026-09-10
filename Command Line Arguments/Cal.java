class Cal
{
    public static void main(String []args)
    {
        System.out.print("The First No Is \n");
        
        System.out.print(Integer.parseInt(args[0]));
        System.out.print("\n The Second No Is \n");
        System.out.print(Integer.parseInt(args[1]));
        System.out.print("\n The Sum is \n");
        System.out.print(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
         System.out.print("\n The Diff is \n");
        System.out.print(Integer.parseInt(args[0]) - Integer.parseInt(args[1]));
        System.out.print("\n The Product is \n");
        System.out.print(Integer.parseInt(args[0]) * Integer.parseInt(args[1]));
        System.out.print("\n The Quotint is \n");
        System.out.print(Integer.parseInt(args[0]) / Integer.parseInt(args[1]));
        System.out.print("\n The reminder is \n");
        System.out.print(Integer.parseInt(args[0]) % Integer.parseInt(args[1]));
    }
}