package questions;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
		Bird bird = new Bird();
		
		Animal animal1 = animal.getObject();
		Bird bird1 = bird.getObject();
		System.out.println(animal);
		System.out.println(animal1);
		System.out.println(bird);
		System.out.println(bird1);

	}

}

class Animal {
    public Animal getObject() {
        return new Animal();
    }
}

class Bird extends Animal {
    @Override
    public Bird getObject() {
        return new Bird();
    }
}
