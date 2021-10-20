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

        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
    }
}
