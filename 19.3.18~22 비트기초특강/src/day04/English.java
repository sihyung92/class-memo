package day04;

public class English implements People {

	@Override
	public void speak() {
		// override = method의 내용을 재정의 하는것
		System.out.println("영어를 말한다.");
	}
	@Override
	public void eat() {
	System.out.println("맛 없는 영국 음식");}
	@Override
	public void fight() {
	}

}
