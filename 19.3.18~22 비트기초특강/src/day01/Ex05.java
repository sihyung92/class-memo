package day01;
//�л��� �̸�, ��������, ��������, ���������� �Է¹޾Ƽ� ����ϴ� ���α׷�
import java.util.Scanner;
public class Ex05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�̸��� �Է����ּ���: ");
		String name = scan.nextLine();
		System.out.print("���������� �Է����ּ���: ");
		int kor = scan.nextInt();
		System.out.print("���������� �Է����ּ���: ");
		int eng = scan.nextInt();
		System.out.print("���������� �Է����ּ���: ");
		int math = scan.nextInt();
		System.out.println(name+"�л��� ���������� "+kor+"���̰� ���������� "+eng+"���̰� ���������� "+math+"���Դϴ�.");
	}
}
