package day02;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = new String();
		int kor = 0;
		int eng = 0;
		int math = 0;
		while (true) {
			System.out.print("1. ���� �Է� 2. ������ ���� ��� 3. ����");
			int userChoice = scan.nextInt();
			if (userChoice == 3) {
				System.out.println("������ּż� �����մϴ�.");
				break;
			} else if (userChoice == 1) {
				scan.nextLine();
				System.out.print("�̸��� �Է����ּ���: ");
				name = scan.nextLine();

				System.out.print("���������� �Է����ּ���: ");
				kor = scan.nextInt();
				while (true) {
					if (kor >= 0 && kor <= 100) {
						break;
					}
					System.out.print("�ٽ� �Է����ּ��� : ");
					kor = scan.nextInt();
				}
				System.out.print("���� ������ �Է����ּ���: ");
				eng = scan.nextInt();
				while (true) {
					if (eng >= 0 && eng <= 100) {
						break;
					}
					System.out.print("�ٽ� �Է����ּ��� : ");
					eng = scan.nextInt();
				}
				System.out.print("���� ������ �Է����ּ���: ");
				math = scan.nextInt();
				while (true) {
					if (math >= 0 && math <= 100) {
						break;
					}
					System.out.print("�ٽ� �Է����ּ��� : ");
					math = scan.nextInt();
				}
			} else if (userChoice == 2) {
				if (name.equals("")) {
					System.out.println("�Էµ� ���� �����ϴ�.");
				} else {
					System.out.println("�̸��� " + name + "�̰� ���������� " + kor + " ���������� " + eng + " ���������� " + math + "�Դϴ�.");
					int sum = kor + eng + math;
					System.out.println("�� ������ "+sum+"�Դϴ�.");
					System.out.println("��� ������ " +sum / 3.0f+"�Դϴ�.");
				}
			}
		}
	}
}
