package subtle.P6_AdvancedDataStructures.P6_4_LinkedHashMapExample;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    
    public static void main(String[] args) {

        // Linked Hash Maps are ordered, whereas the normal ones aren't
        // Constructor's args in line 16: 
        // 4 = initial capacity
        // 0.75f = load factor
        // false = retain in entered order; true = use access order instead
        LinkedHashMap<String, Integer> phonebook = new LinkedHashMap<>(4, 0.75f, true);
        phonebook.put("Kevin", 12345);
        phonebook.put("Eli", 98765);
        phonebook.put("Lola", 123123);
        phonebook.put("Gabri", 777777);
        phonebook.put(null, 000);
        System.out.println("Gabri's number: " + phonebook.get("Gabri"));
        
        System.out.println("\nList of contacts in phonebook:");
        for(Map.Entry<String, Integer> entry: phonebook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

