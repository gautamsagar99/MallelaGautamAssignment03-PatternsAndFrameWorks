package questions;

class MasterClass {
    public static void staticMethod() {
        System.out.println("Static method in MasterClass");
    }
    
    private void privateMethod() {
        System.out.println("Private method in MasterClass");
    }
}

class Subclass extends MasterClass {
    public static void staticMethod() {
        System.out.println("Static method in subclass");
    }
    
    // Cannot override private method in MasterClass
    // but can provide a method with same name and signature
    private void privateMethod() {
        System.out.println("Private method in subclass");
    }
}


public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Superclass.staticMethod();
        
        // Call subclass static method using subclass name
        Subclass.staticMethod();
        
        // Call superclass private method from within superclass
        
//        Superclass sc = new Superclass();
//        sc.privateMethod();

	}

}
