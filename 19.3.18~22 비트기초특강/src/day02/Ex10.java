package day02;

//���ڸ� �Է¹޾Ƽ� 0~���ڱ��� ����ϴ� ���α׷�
import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ���.");
		int num = scan.nextInt();
		for (int i = 0; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.println(i + "��(��) ¦���Դϴ�.");
			} else {
				System.out.println(i + " Ȧ���Դϴ�.");
			}
		}
	}
}