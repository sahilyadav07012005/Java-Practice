class X {
    int data = 20;
}

class Y extends X {
}

class Child extends Y {

    public void display() {
        System.out.println("Number is " + data);
    }

    public static void main(String[] args) {
        Child num = new Child();
        num.display();
    }
}