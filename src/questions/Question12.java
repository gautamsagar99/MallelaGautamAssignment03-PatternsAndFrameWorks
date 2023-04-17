package questions;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


//final example
class finalKeyword {
    final int num = 10; // a final variable
    final void display() { // a final method
        System.out.println("This is a final method.");
    }
}








public class Question12 {

	public static void main(String[] args) {
		//finally example
		String path = "file1.txt";
        try {
        	FileReader fr = new FileReader(path);
	         BufferedReader br = new BufferedReader(fr);
	         System.out.println(br.readLine());      
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        } finally {

            System.out.println("Finally block executed.");
        }

        
        
        
        //finalize example
        Question12 obj1 = new Question12();
        obj1 = null;
        System.gc(); // invoking garbage collector


	}
	
	
	
	
	//finalize example
	public void finalize() {
        System.out.println("Finalize method called.");
    }


}
