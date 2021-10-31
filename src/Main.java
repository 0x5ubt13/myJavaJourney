import java.util.Scanner;

public class Main {

    public static void basics() {
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
        // String studentFirstName = "Kayla";
        // String studentLastName = "Hammond";
        // System.out.println(studentFirstName);
        // System.out.println(studentLastName);
        // char studentFirstInitial = studentFirstName.charAt(0);
        // char studentSecondInitial = studentLastName.charAt(0);
        // System.out.println(studentFirstInitial);
        // System.out.println(studentSecondInitial);

        // System.out.println(studentFirstName + " " +
        // studentLastName + " has a GPA of " + studentGPA);
                
        // Taking input:
        // System.out.println("What do you want to update it to?");
        // Scanner input = new Scanner(System.in);
        // studentGPA = input.nextDouble();
        // input.close();

        // When taking input via scanner, we want to "cast it" to the type we want afterwards using
        // the next method along with the type "blah.nextString()", "blah.nextInt()", etc

        // System.out.println(studentFirstName + " " + 
        // studentLastName + " now has a GPA of " + studentGPA);
        

        // Relational Operators:
        // <, >, ==, >=, <=, !=

        // Flow control: The Fortune Teller:
        System.out.println("Pick a number between 1 and 10:");
        Scanner fortune = new Scanner(System.in);
        int fortuneTellerInput = fortune.nextInt();

        if (fortuneTellerInput < 5) {
            System.out.println("Enjoy the good luck a friend brings you");
        } else {
            System.out.println("Your shoe selection will make you very happy today");
        }

        // Loops
        Scanner whileLoop = new Scanner(System.in);
        boolean isOnRepeat = true;
        while(isOnRepeat) {
            System.out.println("Playing current song");
            System.out.println("Would you like to take this song off of repeat? If so, answer yes");
            String userInput = whileLoop.next();

            if(userInput.equals("yes")){
                isOnRepeat = false;
            }
        }

        System.out.println("Playing next song");
    }

    public static void challenge1() {
        String question = "Which was the most popular programming language in 2020?";
        String choiceOne = "Python";
        String choiceTwo = "JavaScript";
        String choiceThree = "Java";

        String correctAnswer = choiceTwo.toLowerCase();

        // Write a print statement asking the question
        // Write a print statement giving the answer choices

        System.out.println(question + "\n- " + choiceOne + "\n- " + choiceTwo + "\n- " + choiceThree);
        
        // Have the user input an answer
        // Retrieve the user's input

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();


        // If the user's input matches the correctAnswer...
        
        if (answer.toLowerCase().equals(correctAnswer)) {
            // then the user is correct and we want to print out a congrats message to them.
            System.out.println("Your answer is correct! Congrats!");
        } else {
            // If the user's input doesn't match the correctAnswer...
            // then the user is incorrect and we want to print out a message saying the user is wrong.
            System.out.println("Sorry, your answer is wrong. Try again!");
        }
    }

    public static void functions() {
        // Call here all the functions created during the functions chapter
        //developerTeaTime();
        double mealPrice = calculateTotalMealPrice(100, .2, .08);
        individualMealPrice(mealPrice);

    }

    public static void developerTeaTime() {
        System.out.println("Waiting for developer tea time.");
        System.out.println("Type in a random word and press Enter to start developer tea time:");
        Scanner input = new Scanner(System.in);
        input.next();
        input.close();
        System.out.println("It's developer tea time!");
    }

    public static double calculateTotalMealPrice(double listedMealPrice, 
                                                 double tipRate, 
                                                 double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        System.out.println("Your total meal price is " + result);

        return result;
    }

    public static void individualMealPrice(double totalPrice){
        System.out.println("How many people are in the table?");
        Scanner scanner = new Scanner(System.in);
        double people = scanner.nextDouble();
        double individualPrice = totalPrice / people;
        System.out.println("The shared price is £" + individualPrice + " per person");
    }

    public static void dotOperator() {
        // Example with Math.pow
        System.out.println("Calculating powers.\nPlease enter the base, press Enter and then enter the exponent: ");
        Scanner aScan = new Scanner(System.in);
        Scanner bScan = new Scanner(System.in);
        double a = aScan.nextDouble();
        double b = bScan.nextDouble();
        double result = Math.pow(a, b);
        System.out.println(a + " elevated to the power of " + b + " is: " + result);
    }

    public static void main(String[] args){
        //basics();
        //challenge1();
        //functions();
        dotOperator();
    }
}


