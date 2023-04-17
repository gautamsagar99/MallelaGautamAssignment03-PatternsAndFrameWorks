package questions;

 class MyThread extends Thread {
    @Override
    public void run() {
        // Code to be executed in the thread
        System.out.println("MyThread running in " + Thread.currentThread().getName());
    }
}

class MyRunnable1 implements Runnable {
    @Override
    public void run() {
        // Code to be executed in the thread
        System.out.println("MyRunnable running in " + Thread.currentThread().getName());
    }
}

public class Question19 {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
        myThread.start();
		
		
		
        MyRunnable1 myRunnable = new MyRunnable1();
        Thread myThread1 = new Thread(myRunnable);
        myThread1.start();
    }
}
