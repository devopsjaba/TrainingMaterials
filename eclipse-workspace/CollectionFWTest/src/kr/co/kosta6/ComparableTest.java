package kr.co.kosta6;

import java.util.Set;
import java.util.TreeSet;

class Student implements Comparable<Student> {
	private String name;
	private int age;
	
	public Student() {}

	public Student(String name, int age) {
		//super();
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name +" : "+ age;
	}

	@Override
	public int compareTo(Student stu) {
		//return this.age - stu.age;			    //나이 오름차순 정렬
		//return stu.age - this.age;				//나이 내림차순 정렬
		return this.name.compareTo(stu.name);		//이름 오름차순 정렬 
		//return stu.name.compareTo(this.name);		//이름 내림차순 정렬 
	}
	
}

public class ComparableTest {
	public static void main(String[] args) {
		Set<Student> tree = new TreeSet<>();
		tree.add(new Student("이순신", 30));
		tree.add(new Student("신사임당", 40));
		tree.add(new Student("류성룡", 25));
		tree.add(new Student("이순신", 60));
		
		for(Student s : tree)
			System.out.println(s);
	}
}







