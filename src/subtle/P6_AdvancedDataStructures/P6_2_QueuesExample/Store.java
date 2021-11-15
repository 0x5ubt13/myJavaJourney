package subtle.P6_AdvancedDataStructures.P6_2_QueuesExample;

import java.util.LinkedList;

public class Store {
    
    public static void main(String[] args) {
        
        LinkedList<Customer> queue = new LinkedList();
        queue.add(new Customer("Sally"));
        queue.add(new Customer("Maria"));
        queue.add(new Customer("Emanuel"));
        queue.add(new Customer("Manolete"));
        System.out.println(queue);
        serveCustomer(queue);
        System.out.println(queue);
    }

    static void serveCustomer(LinkedList<Customer> queue) {

        Customer c = queue.poll();
        c.serve();


    }
}
