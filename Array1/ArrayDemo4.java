class ArrayDemo4 {
void display(int ar[]) {
for(int i=0; i<=ar.length; i++) {
System.out.println(ar[i]);
}
}
}
public static void main(String args[]) {
ArrayDemo ad = new ArrayDemo();
int a[] = {10,20,30};
ad.display(a);
}
}
}