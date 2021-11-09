package subtle.advanced_data_structures.QueuesExample;

import java.util.LinkedList;

public class Store {
    
    public static void main(String[] args) {
        
        LinkedList<Customer> queue = new LinkedList();
        queue.add(new Customer("Sally"));
        queue.add(new Customer("Maria"));
        queue.add(new Customer("Emanuel"));
        queue.add(new Customer("Manolete"));
    }
}
