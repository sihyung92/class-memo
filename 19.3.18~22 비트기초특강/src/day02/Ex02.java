package day02;
import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// ���ڸ� �Է¹޾� 2�� ������� 3�� ������� �� ���� ������� �Ǵ��ϴ� ���α׷�

		System.out.println("���ڸ� �Է��Ͻÿ�");
		int input = scan.nextInt();
		//���� �����ϸ� ���� ������ ������ �ʰ� �������� ������ 6�� ����� ��� 2�� ������ ��µȴ�.
		if (input %2==0) {
			System.out.println("2�� ����Դϴ�.");
		}else if (input %3==0) {
			System.out.println("3�� ����Դϴ�.");
		}else {System.out.println("�� ���� ���Դϴ�.");
		
		}
	}
}
