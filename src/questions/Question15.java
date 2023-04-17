package questions;

import java.util.HashMap;
import java.util.Hashtable;

public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<String, Integer> hashtable = new Hashtable<>();
		hashtable.put("John", 25);
		hashtable.put("Sarah", 30);
		hashtable.put("Tom", 27);
		int age = hashtable.get("Sarah");
		System.out.println(hashtable);

		
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("John", 25);
		hashMap.put("Sarah", 30);
		hashMap.put("Tom", 27);
		int age1 = hashMap.get("Sarah"); 
		System.out.println(hashMap);

	}

}
