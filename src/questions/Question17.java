package questions;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

import java.util.Iterator;

public class Question17 {
	public static void main(String[] args) {
        // Example of fail-fast iterator
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator<Integer> iterator =  list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            list.add(4); // Throws ConcurrentModificationException
        }

        CopyOnWriteArrayList<Integer> copyList = new CopyOnWriteArrayList<>();
        copyList.add(1);
        copyList.add(2);
        copyList.add(3);
        Iterator<Integer> copyIterator = copyList.iterator();
        while (copyIterator.hasNext()) {
            System.out.println(copyIterator.next());
            copyList.add(4); // Doesn't throw ConcurrentModificationException
        }
    }
}
