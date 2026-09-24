import java.util.Scanner;
class TwoDArray2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int ar[][]=new int[3][3];
        System.out.println("Enter a numbers");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ar[i][j]=sc.nextInt();            
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(ar[i][j]+"\t");            
            }
            System.out.println();
        }
           
        
    }
}