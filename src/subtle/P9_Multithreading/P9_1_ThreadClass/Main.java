package subtle.P9_Multithreading.P9_1_ThreadClass;

public class Main {
    
    public static void main(String[] args) {
        
        // Every time a java program is run at least 1 thread is created.
        ThreadExample thread1 = new ThreadExample();
        thread1.setName("My first thread");
        thread1.start();
        
        ThreadExample thread2 = new ThreadExample();
        thread2.setName("My second thread");
        thread2.start();
        //System.out.println("Active threads: " + Thread.activeCount());
    }
}
