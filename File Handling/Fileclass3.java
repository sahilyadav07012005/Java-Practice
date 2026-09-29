import java.io.File;

public class Fileclass3 {
    public static void main(String[] args) {
        File file = new File("D:\\Other Data\\Seasons.txt");
        String newName = "Unwatched Seasons.txt";
        File newFile = new File(file.getParent(), newName);
        if (file.renameTo(newFile)) {
            System.out.println("File renamed successfully.");
        } else {
            System.out.println("Failed to rename the file.");
        }
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}