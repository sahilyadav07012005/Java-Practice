import java.util.Scanner;
class TwoDArray2 {
public static void main(String args[]){
int ar[][] = new int[3][3];
Scanner sc = new Scanner(System.in);
System.out.println("Enter Array's Elements :");
for(int i=0; i<3; i++) {
for(int j=0; j<3; j++) {
ar[i][j] = sc.nextInt();
System.out.println("ar["+i+"]["+j+"] = "+" "+ar[i][j]);
}
System.out.println();
}
}
}