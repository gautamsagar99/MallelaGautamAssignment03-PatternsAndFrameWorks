package questions;

import java.util.HashMap;

public class Question16 {

	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<>();
        
        // Add key-value pairs to the HashMap
        hashMap.put("John", 25);
        hashMap.put("Sarah", 30);
        hashMap.put("Tom", 27);
        
        // Retrieve values from the HashMap
        int johnAge = hashMap.get("John"); 
        int sarahAge = hashMap.get("Sarah"); 
        
        // Remove a key-value pair from the HashMap
        hashMap.remove("Tom");
        
        // Check if a key is present in the HashMap
        boolean containsJohn = hashMap.containsKey("John"); 
        boolean containsTom = hashMap.containsKey("Tom");
        
        // Get the size of the HashMap
        int size = hashMap.size();
        
        // Iterate over the key-value pairs in the HashMap
        for (HashMap.Entry<String, Integer> entry : hashMap.entrySet()) {
            String name = entry.getKey();
            int age = entry.getValue();
            System.out.println(name + ": " + age);
        }

	}
}
