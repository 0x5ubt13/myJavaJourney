package src;

// Access Modifiers:
    // 1) Private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
    // 2) Default: The access level of a default modifier is only within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.
    // 3) Protected: The access level of a protected modifier is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.
    // 4) Public: The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package.

// Non-access Modifiers:
    // 1) Static: modifier for creating class methods and variables.
    // 2) Final: modifier for finalizing the implementations of classes, methods, and variables.
    // 3) Abstract: modifier for creating abstract classes and methods.
    // 4 & 5) Synchronized and Volatile: modifiers, which are used for threads

// Java methods:
    // 1) Void: returns nothing
    // 2) Int: returns an integer

public class HelloWorld {

    public static void main(String[] args){
        // We need "static" for Java to find our method to run the code we are going to add below,
        // and "void" to determine we don't want for it to return anything

        System.out.println("Hello World!"); // Traditional first line of text:
    }
}













