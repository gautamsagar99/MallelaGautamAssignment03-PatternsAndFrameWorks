package questions;

public class Question18 {
	public static void main(String[] args) {
        Thread myThread = new Thread(() -> {
            System.out.println("My thread is running");
        });

        myThread.start();
        myThread.start(); // Throws IllegalThreadStateException
    }

}
