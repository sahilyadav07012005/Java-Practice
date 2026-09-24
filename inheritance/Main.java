class Device {
    void powerOn() {
        System.out.println("Device is powering on...");
    }
}

// Parent class extending Grandparent (Level 1)
class Computer extends Device {
    void bootOS() {
        System.out.println("Booting the operating system...");
    }
}

// Child class extending Parent (Level 2)
class Laptop extends Computer {
    void chargeBattery() {
        System.out.println("The laptop is now charging.");
    }
}

// Main class to execute the program
public class Main {
    public static void main(String[] args) {
        // Instantiate the bottom-most child class
        Laptop myLaptop = new Laptop();
        
        // Accessing methods from all levels of the inheritance chain
        myLaptop.powerOn();       // Inherited from Grandparent (Device)
        myLaptop.bootOS();        // Inherited from Parent (Computer)
        myLaptop.chargeBattery(); // Declared in Child (Laptop)
    }
}