package day02;
import java.util.Scanner;
public class Ex05 {
	public static void main(String[] args) {
		int num = 5;
		switch(num) {
		//break���� ���� ������ break�� ���� �� Ȥ�� ���� �� ���� ������.
		case 5:
			System.out.println("5�Դϴ�.");
			break;
		case 4:
			System.out.println("4�Դϴ�.");
			break;
		case 3:
			System.out.println("3�Դϴ�.");
			break;
		default:
			System.out.println("�� ���� �����Դϴ�.");
			break;
		}
	}
}
