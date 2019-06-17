package day01;

public class Ex02 {
public static void main(String[] args) {
	int myNum = 30;
	//.은 예약어로 인식함, 실수를 표시하고 싶을때는 뒤에 f를 붙여줘야함
	//double은 d와 f를 붙여줄 수 있지만
	//float은 double보다 크기가 작기 때문에
	//d를 붙여줄 수 없다.
	float myFloat = 0.0f;
	double myDouble = 0.0f;

	//char를 초기화 할때는 1글자를 작은따옴표에 넣어서 한다.
	//'A';
	char myChar = 'c';
	myNum = myChar; //알파벳 문자를 Number로 바꾸려고 하면 아스키코드상의 숫자로 변환됨
	
	System.out.println(myNum);
	System.out.println(myFloat);
	System.out.println(myDouble);
	System.out.println(myChar);
	boolean isTrue =true;
	System.out.println(isTrue);

}
}
