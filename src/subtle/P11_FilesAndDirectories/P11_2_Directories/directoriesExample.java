package subtle.P11_FilesAndDirectories.P11_2_Directories;

import java.io.File;
import java.io.FilenameFilter;

public class directoriesExample {
    
    public static void main(String[] args) {
        
        // Creating a filter to avoid showing directories
        FilenameFilter filter = (file, fileName) -> {
            return fileName.contains(".");
        };

        String[] contents = new File("./src/subtle/P11_FilesAndDirectories/P11_2_Directories/").list(filter);
        for(String file: contents) {
            System.out.println(file);
        }

        new File("./src/subtle/P11_FilesAndDirectories/P11_2_Directories/myDirectory").mkdir();
    }
}
