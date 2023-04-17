package questions;

import java.io.FileNotFoundException;
import java.io.IOException;

class Class1 {
    public void printMethod() throws IOException, InterruptedException {
        System.out.println("superclass method");
    }
}

class Subclass1 extends Class1 {
    // This will result in a compilation error
    public void printMethod() throws FileNotFoundException {
        System.out.println("Subclass method");
    }
}

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
