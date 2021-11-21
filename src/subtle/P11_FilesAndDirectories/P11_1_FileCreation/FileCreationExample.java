package subtle.P11_FilesAndDirectories.P11_1_FileCreation;

import java.io.File;
import java.io.IOException;

public class FileCreationExample {
    
    public static void main(String[] args) {
        
        File myFile = new File("./src/subtle/P11_FilesAndDirectories/P11_1_FileCreation/myFile.txt");
        try{
            boolean fileCreated = myFile.createNewFile();
            if (fileCreated == true) {
                System.out.println("File successfully created");
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException ioe) {

        }
    }
}
