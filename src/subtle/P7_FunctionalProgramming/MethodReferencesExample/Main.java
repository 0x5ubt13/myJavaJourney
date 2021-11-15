package subtle.P7_FunctionalProgramming.MethodReferencesExample;

public class Main {
    
    public static void main(String[] args) {
        
        Square s = new Square(4);

        // Lambda way:
        Shapes shapes = (Square square) -> {
            return square.calculateArea();
        };
        System.out.println("Area: " + shapes.getArea(s));

        // Method reference way:
        Shapes shapesMethRef = Square::calculateArea;
        System.out.println("Area: " + shapesMethRef.getArea(s));
    }   
} // only 4 words. lol.
