class Pyramid{
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(2*i-1);
            }
            System.out.println();
        }
    }
}