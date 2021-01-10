package subtle.helloWorld;

public class ByteShortIntLong {

    public static void main(String[] args){

        // Integer summary:
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value: " + myMinIntValue);
        System.out.println("Integer Maximum Value: " + myMaxIntValue);
        System.out.println("First Overflowed Value: " + (myMaxIntValue + 1));
        System.out.println("First Underflowed Value: " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647; // We can write it like this and it still works!


        // Byte summary:
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value " + myMinByteValue);
        System.out.println("Byte Maximum Value " + myMaxByteValue);
        System.out.println("There exists no overflow with Maximum Byte value: " + (myMaxByteValue + 1));
        System.out.println("There exists no underflow with Minimum Byte Value: " + (myMinByteValue - 1));


        // Short summary:
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value " + myMinShortValue);
        System.out.println("Short Maximum Value " + myMaxShortValue);
        System.out.println("There exists no overflow with Maximum Short value: " + (myMaxShortValue + 1));
        System.out.println("There exists no underflow with Minimum Byte Value: " + (myMinShortValue - 1));


        // Long summary:
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value " + myMinLongValue);
        System.out.println("Long Maximum Value " + myMaxLongValue);
        System.out.println("First Overflowed Value: " + (myMaxLongValue + 1));
        System.out.println("First Underflowed Value: " + (myMinLongValue - 1));

        long bigLongLiteralValue = 2_147_483_647_123L; // This kind of writing still works but we need to append L
        System.out.println("Big Long test: " + bigLongLiteralValue);


        // Casting in a nutshell:
        int myNewIntValue = (myMinIntValue / 2); // No errors

        // byte myNewByteValue = (myMinByteValue / 2); throws an error. We need to "Cast to Byte":
        byte myNewByteValue = (byte) (myMinByteValue / 2);

        // short myNewShortValue = (myMinShortValue / 2); throws an error. We need to "Cast to Short":
        short myNewShortValue = (short) (myMinShortValue / 2);


        // Having fun using different primitive Types together!
        byte myOwnByteValue = 75;
        short myOwnShortValue = 30000;
        int myOwnIntValue = 3500;
        long myReallyLongValue = 99 * 50000L + 1000 * (myOwnByteValue + myOwnShortValue + myOwnIntValue);
        System.out.println("My not-so-Long value be like: " + myReallyLongValue);


    }
}
