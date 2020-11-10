import java.io.File;

public class FileCounter{
    public static void main(String[] args) {
        File Files = new File("C:\\Users\\George\\Desktop\\BTU_DOCUMENT");
        int num = Files.list().length;
        System.out.println(num);
    }
}