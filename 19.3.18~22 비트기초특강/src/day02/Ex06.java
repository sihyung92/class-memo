package day02;

//���� �Է¹޾� �� �� ���� �ִ��� �����ִ� ���α׷�
//Switch���� ����Ѵ�.
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���");
		int month = scan.nextInt();
		switch (month) {
		// switch ���� ��� ������ �����ϴ� case ���� break�� ������ case���� ���������� ����ȴ�.
		case 1:		case 3:		case 5:		case 7:		case 8:		case 10:
		case 12:
			System.out.println("31�ϱ��� �ֽ��ϴ�.");
			break;
		case 4:		case 6:		case 9:		case 11:
			System.out.println("30�ϱ��� �ֽ��ϴ�.");
			break;
		case 2:
			System.out.println("������ �Է����ּ���. : ");
			int year = scan.nextInt();
			if (year % 4 == 0) {
				if (year % 100 == 0) {
					if (year % 400 == 0) {
						System.out.println("29�ϱ��� �ֽ��ϴ�.");
					} else {
						System.out.println("28�ϱ��� �ֽ��ϴ�.");
					}
				} else {
					System.out.println("29�ϱ��� �ֽ��ϴ�.");
				}
			} else {
				System.out.println("28�ϱ��� �ֽ��ϴ�.");
			}
			break;
		default:
			System.out.println("�� �� �Է��ϼ̽��ϴ�.");
			break;
		}
	}
}
