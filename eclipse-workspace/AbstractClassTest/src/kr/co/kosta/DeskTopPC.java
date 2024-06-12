package kr.co.kosta;

public class DeskTopPC extends Computer {

	@Override
	public void display() {
		System.out.println("DeskTopPC display()");	
	}

	@Override
	public void typing() {
		System.out.println("DeskTopPC typing()");	
	}

	@Override
	public void turnOff() {
		System.out.println("DeskTopPC turnOff()");	
	}
}
