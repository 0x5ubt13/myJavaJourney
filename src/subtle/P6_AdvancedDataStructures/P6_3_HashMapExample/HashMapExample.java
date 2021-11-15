package subtle.P6_AdvancedDataStructures.P6_3_HashMapExample;

import java.util.HashMap;

public class HashMapExample {
    
    public static void main(String[] args){

        HashMap<String, Integer> phonebook = new HashMap<>();
        phonebook.put("Kevin", 12345);
        phonebook.put("Eli", 98765);
        phonebook.put("Lola", 123123);
        phonebook.put("Eli", 777777);
        phonebook.put(null, 000);
        System.out.println(phonebook);
        if(phonebook.containsKey("Eli")){
            phonebook.remove("Eli");
        }
        System.out.println(phonebook);
    }
}
