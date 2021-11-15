package subtle.P5_Generics.P5_1_GenericMethods;

import java.util.List;
import java.util.ArrayList;

public class GenericMethods {
    
    static Character[] charArray = {'h', 'e', 'l', 'l', 'o'};
    static Integer[] intArray = {1, 2, 3, 4, 5};
    static Boolean[] boolArray = {true, false, true};

    /* If we don't use <T> before the return type, if in main we substitute List<Integer> for List<String> it will break the program:

    public static List arrayToList(Object[] array, List<Object> list) {
        for (Object object : array) {
            list.add(object);
        }
        return list;
    } */
    
    // Now the <T> is creating a temp variable inside the method and we can specify which type is it going to be
    public static <T> List<T> arrayToList(T[] array, List<T> list) {
        for (T object : array) {
            list.add(object);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(charArray);
        List<Character> charList = arrayToList(charArray, new ArrayList<>());
        List<Boolean> boolList = arrayToList(boolArray, new ArrayList<>());
        List<Integer> intList = arrayToList(intArray, new ArrayList<>());
        System.out.println(charList);
    }

}
