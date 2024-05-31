package kr.co.kosta;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Animal("일반동물", 5);
		animal.eat();
		animal.sleep();
		System.out.println();
		
		Mammal mammal = new Mammal("포유류", 3, true);
		mammal.eat();
		mammal.sleep();
		mammal.walk();
		System.out.println();
		
		Dog dog = new Dog("왕자", 2, true, "진돗개");
		dog.eat();
		dog.sleep();
		dog.walk();
		dog.bark();
	}
}
