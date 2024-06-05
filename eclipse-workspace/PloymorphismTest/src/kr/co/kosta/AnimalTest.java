package kr.co.kosta;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	
	public void eating() {
		System.out.println("동물이 먹습니다.");
	}
}

class Dog extends Animal {
	
	@Override
	public void move() {
		System.out.println("강아지가 던진거를 물어옵니다.");
	}
	
	@Override
	public void eating() {
		System.out.println("강아지가 사료를 먹습니다.");
	}
}

class Tiger extends Animal {
	@Override
	public void move() {
		System.out.println("호랑이가 네발로 걸어다닙니다.");
	}
	
	@Override
	public void eating() {
		System.out.println("호랑이가 사냥한 것을 먹습니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
}

class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
}

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Animal dAnimal = new Dog();
		Animal tAnimal = new Tiger();
		
		animal.move();
		dAnimal.move();
		tAnimal.move();
		System.out.println();
		
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(animal);
		animalList.add(dAnimal);
		animalList.add(tAnimal);
		
		for(Animal animal2 : animalList) {
			animal2.move();
		}
		
		
	}
}



