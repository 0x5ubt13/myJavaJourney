package subtle.P11_FilesAndDirectories.P11_3_PathClass;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class pathClassExample {

    public static void main(String[] args) {

        // Creating file
        File myFile = new File("./src/subtle/P11_FilesAndDirectories/P11_3_PathClass/Hello world.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        
        // Deleting it with Path and Paths.get()
        Path path = Paths.get("./src/subtle/P11_FilesAndDirectories/P11_3_PathClass/Hello world.txt");
        try {
            Files.deleteIfExists(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Getting paths info with Path and Paths
        Path path2 = Paths.get("./src/subtle/P10_InputOutput/P10_2_ReadingFiles/example.txt");
        System.out.println(path2.getParent());
        System.out.println(path2.getRoot());
        System.out.println(path2.getFileName());
    }
    
}
