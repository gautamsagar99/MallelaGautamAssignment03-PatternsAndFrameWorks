package questions;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello";
        String str2 = str1.concat(" World");
        
        System.out.println("str1: " + str1); // Output: Hello
        System.out.println("str2: " + str2); // Output: Hello World
        
        StringBuffer sb1 = new StringBuffer("Hello");
        StringBuffer sb2 = sb1.append(" World");
        
        System.out.println("sb1: " + sb1); // Output: Hello World
        System.out.println("sb2: " + sb2); // Output: Hello World


	}

}
