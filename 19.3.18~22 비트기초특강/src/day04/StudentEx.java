package day04;

public class StudentEx {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.eatKimchi();
		stu.eat();
		stu.speak();
		
		English eng = new English();
		eng.eat();
		eng.speak();
		//다형성 : 인터페이스를 사용해서 다양한 method를 override하는 것
	}
}