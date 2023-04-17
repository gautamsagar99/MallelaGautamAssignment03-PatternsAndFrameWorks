
package questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        List<String> vector = new Vector<>(); // creating a Vector object
        List<String> arrayList = new ArrayList<>(); // creating an ArrayList object
        vector.add("apple");
        vector.add("banana");
        vector.add("cherry");
        
        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("cherry");
        System.out.println("Vector: " + vector.get(1));
        System.out.println("ArrayList: " + arrayList.get(1));
        
        vector.remove(1);
        arrayList.remove(1);
        System.out.println("Vector size: " + vector.size());
        System.out.println("ArrayList size: " + arrayList.size());
        vector.add("date");
        arrayList.add("date");
        System.out.println("Vector size: " + vector.size());
        System.out.println("ArrayList size: " + arrayList.size()); 
        System.out.print("Vector: ");
        for (String fruit : vector) {
            System.out.print(fruit + " ");
        }
        System.out.println();
        System.out.print("ArrayList: ");
        for (String fruit : arrayList) {
            System.out.print(fruit + " ");
        }
        System.out.println();

	}

}
