import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // System.out.println("Hello World from the IntelliJ IDE!");

        // Primitive types: int, double, char & boolean
        int studentAge = 15;
        double studentGPA = 3.45;
        //char studentFirstInitial = 'K';
        //char studentSecondInitial = 'H';
        boolean hasPerfectAttendance = true;

        System.out.println(studentAge);
        System.out.println(studentGPA);
        //System.out.println(studentFirstInitial);
        //System.out.println(studentSecondInitial);
        System.out.println(hasPerfectAttendance);

        // Reference types:
        // string: a sequence of ordered chars
        String studentFirstName = "Kayla";
        String studentLastName = "Hammond";
        System.out.println(studentFirstName);
        System.out.println(studentLastName);
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentSecondInitial = studentLastName.charAt(0);
        System.out.println(studentFirstInitial);
        System.out.println(studentSecondInitial);

        System.out.println(studentFirstName + " " +
        studentLastName + " has a GPA of " + studentGPA);
                
        // Taking input:
        System.out.println("What do you want to update it to?");
        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
        input.close();

        // When taking input via scanner, we want to "cast it" to the type we want afterwards using
        // the next method along with the type "blah.nextString()", "blah.nextInt()", etc

        System.out.println(studentFirstName + " " + 
        studentLastName + " now has a GPA of " + studentGPA);

    }
}
