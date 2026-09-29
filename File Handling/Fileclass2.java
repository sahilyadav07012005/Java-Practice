import java.io.File;

public class Fileclass2 {
    public static void main(String[] args) {
        File file = new File("D:\\Other Data\\Seasons.txt");
        System.out.println("File length (in bytes): " + file.length());
        System.out.println("Is directory: " + file.isDirectory());
        System.out.println("Is absolute path: " + file.isAbsolute());
        System.out.println("File path: " + file.getPath());
        System.out.println("Last modified: " + file.lastModified());
    }
}