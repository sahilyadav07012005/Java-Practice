class Animal {
    void eat() {
        System.out.println("eating");
    }
}

class Dog extends Animal {
    void eat() {
        super.eat();  
        System.out.println("eating bread");
    }
    
    void bark() {
        System.out.println("barking");
    }
}

class TestOverriding {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   
        d.bark();  
    }
}