package subtle.P11_FilesAndDirectories.P11_4_CopyingFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class copyExample {
    
    public static void main(String[] args) {
        
        Path source = Paths.get("./src/subtle/P10_InputOutput/P10_2_ReadingFiles/example.txt");
        Path dest = Paths.get("./src/subtle/P11_FilesAndDirectories/P11_4_CopyingFiles/example_copied.txt");

        try {
            Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
