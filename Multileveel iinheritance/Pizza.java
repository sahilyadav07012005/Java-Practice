class Food {
    String name = "Pizza";
}

class FastFood extends Food {
    String type = "Fast Food";
}

class Pizza extends FastFood {
    public static void main(String[] args) {
        Pizza p = new Pizza();

        System.out.println("Food: " + p.name);
        System.out.println("Type: " + p.type);
    }
}