class Demo13 {}

class Test extends Demo13 {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        System.out.println(t1 instanceof Test);
        System.out.println(t2 instanceof Test);
        
        Demo13 d = new Demo13();
        System.out.println(d instanceof Demo13);
        System.out.println(d instanceof Test);
        
        Object obj = new Object();
        System.out.println(obj instanceof Object);
        System.out.println(obj instanceof Test);
        System.out.println(t1 instanceof Object);
        System.out.println(d instanceof Object);
        
        System.out.println(null instanceof Test);
        System.out.println(null instanceof Object);
    }
}