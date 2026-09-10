class Salary{
public static void main(String []args){

double salary=Double.parseDouble(args[0]);
 double ta= salary*.1;
 double da= salary*.2;
 double hra= salary*.3;

double gross=salary+ta+da+hra;

System.out.println("SALARY="+salary);
System.out.println("TA="+ta);
System.out.println("DA="+da);
System.out.println("HRA="+hra);
System.out.println("GROSS="+gross);
}
}



