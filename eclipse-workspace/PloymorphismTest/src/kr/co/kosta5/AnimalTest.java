package kr.co.kosta5;

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
	
	public void barking() {
		System.out.println("강아지가 멍멍하고 짖습니다.");
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

class Cat {
	public void sleep() {
		System.out.println("고양이가 잠을 잘 잡니다");
	}
}

public class AnimalTest {
	ArrayList<Animal> aniList = new ArrayList<>();
	
	public static void main(String[] args) {

		AnimalTest aTest = new AnimalTest();
		aTest.addAnimal();
		System.out.println("원래 형으로 다운 캐스팅=================");
		aTest.downCating();
	}

	public void downCating() {
		for(int i = 0; i < aniList.size(); i++) {		//모든 배열 요소를 하나씩 돌면서
			Animal ani = aniList.get(i);				//Animal 형으로 가져옴 
			if (ani instanceof Dog) {
				Dog d = (Dog)ani;
				d.barking();
			}
			else if (ani instanceof Tiger) {
				Tiger t = (Tiger)ani;
				t.hunting();
			}
			else if (ani instanceof Eagle) {
				Eagle e = (Eagle)ani;
				e.flying();
			}
			else {
				System.out.println("지원 되지 않는 형식입니다.");
			}
		}
		
	}

	public void addAnimal() {
		aniList.add(new Dog());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		//aniList.add(new Cat());
		
		for(Animal ani : aniList) {
			ani.move();
		}
		
	}
}











