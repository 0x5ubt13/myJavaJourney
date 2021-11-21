package subtle.P10_InputOutput.P10_3_TryWithResources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class tryWithResourcesExample {

    public static void main(String[] args) {
        
        // The below way of doing this would lead to resource leak:
        // try {
        //     BufferedReader reader = new BufferedReader(new StringReader("Hello World!"));
        //     StringWriter writer = new StringWriter();
        //     writer.write(reader.readLine());
        //     System.out.println(writer.toString());

        // The best way to handle it would be with a "Try with resources":
        try(BufferedReader reader = new BufferedReader(new StringReader("Hello World!"));
            StringWriter writer = new StringWriter();) {
                writer.write(reader.readLine());
                System.out.println(writer.toString());
        } catch (IOException ioe) {
            
        }
    }
    
}
