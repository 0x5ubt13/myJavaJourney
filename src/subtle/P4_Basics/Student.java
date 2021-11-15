package subtle.P4_Basics;

public class Student {
    // Represent a college student#s profile with the student class
    // It should contain first name, last name, expected year to graduate, GPA and declared major
    // The class should have at least one behaviour: incrementing the expected year to grad by one
    // The class sould have a constructor that initializes all of the attributes with dynamic values, meaning the
    // values that the constructor is called with will determine the values of the attributes
    // Then, create two student profile instances and the program should call incrementExpectedGraduationYear on one of the student profiles
    // and print out their expected graduation year instance value to the console
    
    String firstName;
    String lastName;
    int expectedYearToGraduate;
    double GPA;
    String declaredMajor;


    public Student(String firstName, String lastName, 
                   int expectedYearToGraduate,
                   double GPA, String declaredMajor){

            this.firstName = firstName;
            this.lastName = lastName;
            this.expectedYearToGraduate = expectedYearToGraduate;
            this.GPA = GPA;
            this.declaredMajor = declaredMajor;
    }   

    public void incrementExpectedGraduationYear() {
        this.expectedYearToGraduate += 1;
        System.out.println("The expected year to graduate has changed now for the student " 
                           + this.firstName + " " + this.lastName + " and is " + 
                           (this.expectedYearToGraduate));
    }

    public void printExpectedGraduationYear() {
        System.out.println("The expected year to graduate for the student " 
                           + this.firstName + " " + this.lastName + " is " + 
                           (this.expectedYearToGraduate));
    }
}
