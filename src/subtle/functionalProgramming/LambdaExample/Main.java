package subtle.functionalProgramming.LambdaExample;

public class Main {
    
    public static void main(String[] args) {
        
        GreetingMessage gm = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("Hello " + name);
            }
        };
        gm.greet("Gabriel");

        // Lambda, without the need for overriding:
        GreetingMessage gm2 = (String name) -> {
            System.out.println("Hello " + name);
        };
        gm2.greet("Gabriel");

        MessagePrinter mp = () -> {
            System.out.println("This is a message");
        };
        mp.printMessage();

    }
}
