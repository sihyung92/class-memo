package day01;

public class Ex02 {
public static void main(String[] args) {
	int myNum = 30;
	//.�� ������ �ν���, �Ǽ��� ǥ���ϰ� �������� �ڿ� f�� �ٿ������
	//double�� d�� f�� �ٿ��� �� ������
	//float�� double���� ũ�Ⱑ �۱� ������
	//d�� �ٿ��� �� ����.
	float myFloat = 0.0f;
	double myDouble = 0.0f;

	//char�� �ʱ�ȭ �Ҷ��� 1���ڸ� ��������ǥ�� �־ �Ѵ�.
	//'A';
	char myChar = 'c';
	myNum = myChar; //���ĺ� ���ڸ� Number�� �ٲٷ��� �ϸ� �ƽ�Ű�ڵ���� ���ڷ� ��ȯ��
	
	System.out.println(myNum);
	System.out.println(myFloat);
	System.out.println(myDouble);
	System.out.println(myChar);
	boolean isTrue =true;
	System.out.println(isTrue);

}
}
