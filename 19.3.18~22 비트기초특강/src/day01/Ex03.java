package day01;

public class Ex03 {
	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 4;
		//데이터 타입을 변환할 때는 2가지 방법이 있다.
		//암시적 형변환, 명시적 형변환
		//int*float -> float (암시적)
		float num4 = num1*1.0f;
		float num3 = num4 / num2;
		
		//size가 큰 데이터타입에는 작은 것이 자동으로 형변환된다. (암시적)
		double num5 = num3;
		
		/*size가 작은 데이터타입에 큰 것을 할당해주려고 하면 
		 * 명시적 형변환이 필요하다.
		 * 명시적 형변환은 (바꿀 테이터타입)으로 한다.
		 */
		//float num6 = (float)num5;
		//String abc = new String();
		//Object a = new Object();
		//abc = (String)a;
		//Integer d = (Integer)a;
		//System.out.println(num3);	
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
		
		//string + int = string(문자에 숫자가 붙은)이 된다.
		//string에서 +는 두 string를 한개로 연결시키는 연산자이다.
		String aaaa = "12345";
		String bbbb = "56789";
		aaaa = aaaa+bbbb;
		System.out.println(aaaa);
		
		//float 변수 2개
		//3.5, 5.5에 대한 산술연산자를 출력해보기
		float myFloat = 3.5f;
		float myFloat2 = 5.5f;
		System.out.println(myFloat + myFloat2);
		System.out.println(myFloat - myFloat2);
		System.out.println(myFloat * myFloat2);
		System.out.println(myFloat / myFloat2);
		System.out.println(myFloat % myFloat2);
		
		//myFloat = myFloat * 3;
		//myFloat *=3; 위아래 같음
		int a = 4;
		int b = 5;
		System.out.println(a>3&&b>6);
		System.out.println(a>5&&b>6);
		System.out.println(a>3&&b>4);
		System.out.println(a>3||b>6);
		System.out.println(!(a>3));
		
	}
}
