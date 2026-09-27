class Methods1 {
    public static void main(String args[]){
        String str = new String("My name is Salman");
        char[] ch = new char[10];
        try{
            str.getChars(11, 17, ch, 0);
            System.out.println(ch);
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
    }
}