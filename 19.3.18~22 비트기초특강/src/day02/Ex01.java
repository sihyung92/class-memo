package day02;
import java.util.Scanner;
public class Ex01 {

	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���̸� �Է����ּ���.");
		int age = scan.nextInt();
		
		//if���� ���ǹ��� ����� True / False�� ���;� �Ѵ�. ���ǹ��� �������ڸ� ����Ѵ�.
		
		if(age < 18) {
			System.out.println("�̼������Դϴ�.");
		}
		else {
			System.out.println("�����Դϴ�.");
		}
	}
}