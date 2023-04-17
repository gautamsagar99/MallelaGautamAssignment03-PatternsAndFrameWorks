package questions;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Question14 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("one","two"));
		List<String> synchronizedList = Collections.synchronizedList(list);
		System.out.println(synchronizedList);
		
		List<String> list1 = new ArrayList<>(Arrays.asList("one","two"));

		synchronized(list1) {
		    
			System.out.println(list1);
		}
		
		
		
		List<String> list2 = new CopyOnWriteArrayList<>(Arrays.asList("one","two"));
		System.out.println(list2);

		
	}

}
