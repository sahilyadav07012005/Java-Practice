class Demo11 {
}

class Test extends Demo11 {
   public static void main(String[] args) {
        System.out.println(15 == 15);
        System.out.println('a' == 97);
        System.out.println(98.0 == 'b');
        System.out.println(15 == 16.0);
        System.out.println(true == false);
        
        String s1 = new String("Raja");
        String s2 = new String("Raja");
        System.out.println(s1 == s2);
        
        Test t1 = new Test();
        Test t2 = new Test();
        System.out.println(t1 == t2);
        
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        System.out.println(d1 == d2);
    }
}