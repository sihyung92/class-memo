package day04;

public class korean implements People {
	private String name;
	private String SSN;
	
	public void eatKimchi() {
		System.out.println("±èÄ¡¸¦ ¸Ô´Â´Ù.");
	}

	@Override
	public void speak() {
		System.out.println("ÇÑ±¹¾î¸¦ ¸»ÇÑ´Ù.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		System.out.println("±èÄ¡¸¦ ¸Ô´Â´Ù.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		
	}
}
