package day02;
import java.util.Scanner;
public class Ex04 {
	//���� ����ϴ� ��
	//������ 4�� ������ �������� ��
	//�� �߿��� 100���� ������ �������� �ش� ��� 
	//�� �߿��� 400���� ������ �������� �ش� �ٽ� �������� ���Ͽ���
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���.");
		int year = scan.nextInt();
		if(year % 4 == 0) {
			//������ ���ɼ��� �����
			//���� / 100 �� 0�̸� ���
			if(year % 100 == 0) {
				//���� /400�� 0�̸� ����
				if(year % 400 == 0) {
					System.out.println("�����Դϴ�.");
				}else {
						System.out.println("����Դϴ�.");
				}
			}else {
				System.out.println("�����Դϴ�.");
			}
	}else {
			System.out.println("����Դϴ�.");
		}
	}
}