class Methods4 {
    public static void main(String args[]){
        StringBuffer stringBuffer = new StringBuffer("Hello World");
        StringBuffer buff = new StringBuffer("TutorialsPoint");
        System.out.println("capacity = " + buff.capacity());
        buff = new StringBuffer(" ");
        System.out.println("capacity = " + buff.capacity());
        StringBuilder str = new StringBuilder("Hello ");
        System.out.println("string = " + str);
    }
}