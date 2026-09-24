import java.util.Scanner;
class Demo3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[];
         arr=new int[5];
          System.out.println("Enter 5 numbers");
         for (int i = 0; i <arr.length;i++){
            arr[i]=sc.nextInt();
         }
          System.out.println("Entered Numbers Are:->");
       for (int i = 0; i <arr.length;i++){
                System.out.println(arr[i]);
            }
    }
}
