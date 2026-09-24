class X {
    int data = 15;
}

class Y extends X {
}

class Z extends Y {

    public void display() {
        System.out.println("Number is " + data);
    }

    public static void main(String[] args) {
        Z num = new Z();
        num.display();
    }
}