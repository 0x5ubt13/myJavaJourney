package subtle.P10_InputOutput.P10_1_ReadingInput;

import java.util.Scanner;

public class PersonCreator {
    
    public static void main(String[] args) {
        
        // We can comment out the prompts and still work fine
        Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter the name: ");
        System.out.print("Enter the name, age and a phone number: ");
        String name = scanner.next();
        //System.out.print("Enter the age: ");
        int age = scanner.nextInt();
        //System.out.println("Enter a phone number: ");
        Long phoneNumber = scanner.nextLong();
        Person person = new Person(name, age, phoneNumber);
    }
}
