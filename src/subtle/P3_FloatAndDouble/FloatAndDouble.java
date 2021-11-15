package subtle.P3_FloatAndDouble;

public class FloatAndDouble {

    public static void main(String[] args){
        
        float myMaxFloatValue = Float.MAX_VALUE;
        float myMinFloatValue = Float.MIN_VALUE;
        System.out.println("Float minimum value: " + myMinFloatValue);
        System.out.println("Float maximum value: " + myMaxFloatValue);

        double myMaxDoubleValue = Double.MAX_VALUE;
        double myMinDoubleValue = Double.MIN_VALUE;
        System.out.println("Double minimum value: " + myMinDoubleValue);
        System.out.println("Double maximum value: " + myMaxDoubleValue);

        int myIntValue = 5 / 2; // prints a whole number
        // float myFloatValue = (float) 5.25; <--- use 5.25f instead of casting, or even better use double instead of float
        float myFloatValue = 5f / 3f; // 5f prints 5.0
        double myDoubleValue = 5d / 3d; // 10d prints 10.0
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);
    }
}
