package questions;

import java.util.ArrayList;
import java.util.List;

public class Question1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1 = new Dog("dog1");
		d1.appendBreadToName(d1, "german shepard");
	}
}

class Dog{
	private String name;

	public Dog(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void appendBreadToName(Dog d, String breed) {
		System.out.println(d.name + " " + breed);
	}
}
