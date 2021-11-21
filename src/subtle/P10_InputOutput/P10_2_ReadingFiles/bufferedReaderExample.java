package subtle.P10_InputOutput.P10_2_ReadingFiles;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bufferedReaderExample {

    public static void main(String[] args) {
        
        File myFile = new File("./src/subtle/P10_InputOutput/P10_2_ReadingFiles/example.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(myFile));
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            
        }
    }
}
