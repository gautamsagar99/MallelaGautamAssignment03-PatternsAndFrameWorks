package questions;



public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer stringBuffer = new StringBuffer("Hello");
        StringBuilder stringBuilder = new StringBuilder("Hello");
        
        // Append string to StringBuffer and StringBuilder
        long start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
        	stringBuffer.append("World");
        }
        long end = System.nanoTime();
        System.out.println("Time taken by StringBuffer: " + (end - start) + " ns");
        
        start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
        	stringBuilder.append("World");
        }
        end = System.nanoTime();
        System.out.println("Time taken by StringBuilder: " + (end - start) + " ns");

	}

}
