import java.io.File;

public class Fileclass {
    public static void main(String[] args) {
        File file = new File("D:\\Other Data\\Seasons.txt");
        System.out.println("Is it a file?: " + file.isFile());
        System.out.println("Can read file: " + file.canRead());
        System.out.println("Can write to file: " + file.canWrite());
        System.out.println("File exists: " + file.exists());
        System.out.println("File name: " + file.getName());
        System.out.println("Absolute path: " + file.getAbsolutePath());
    }
}
