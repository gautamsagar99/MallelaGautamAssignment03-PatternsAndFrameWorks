package questions;

public class Question24 {
	public static void main(String[] args) {
        // Allocate some memory to create some objects
        for (int i = 0; i < 1000000; i++) {
            Object obj = new Object();
        }
        
        // Suggest the JVM to run the garbage collector
        System.gc();
        
        // Print a message to indicate that the garbage collector may run now
        System.out.println("Suggested the JVM to run the garbage collector");
    }

}
