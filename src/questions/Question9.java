package questions;

import java.io.BufferedReader;
import java.io.FileReader;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path = "file1.txt";
		try (FileReader fr = new FileReader(path);
		         BufferedReader br = new BufferedReader(fr)) {
		         System.out.println(br.readLine());
		    }
		catch (Exception e) {
		    System.out.println("catch block");
		} 


	}

}
