package questions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}


public class Question21 {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Person person = new Person("John", 30);
        
        // Serialize the object to a file
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"));
        out.writeObject(person);
        out.close();
        
        // Deserialize the object from the file
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"));
        Person deserializedPerson = (Person) in.readObject();
        in.close();
        
        // Print the deserialized object
        System.out.println(deserializedPerson);

	}

}
