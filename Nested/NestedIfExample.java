public class NestedIfExample {
    public static void main(String[] args) {
        int age = 25;
        int weight = 55;

        if (age >= 18) {
            System.out.println("Age requirement met (18 or older).");

            if (weight >= 50) {
                System.out.println("Weight requirement met. You are eligible to donate blood.");
            } else {
                System.out.println("Not eligible: Weight must be 50kg or more.");
            }

        } else {
            System.out.println("Not eligible: You must be at least 18 years old.");
        }
    }
}