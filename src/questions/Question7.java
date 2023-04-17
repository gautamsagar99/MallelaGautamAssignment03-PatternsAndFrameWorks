package questions;

public class Question7 {
	final int x = 10; // Declaring a final variable
    
    public final void printMessage() { // Declaring a final method
        System.out.println("Hello, world!");
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}

final class FinalClass { // Declaring a final class
	FinalClass(){
		System.out.println("This is Final Class");
	}
}

class FinalConstructor{
	//cannot declare final constructor
//	final FinalConstructor() {
//		System.out.println("This is Final Constructor");
//	}
}