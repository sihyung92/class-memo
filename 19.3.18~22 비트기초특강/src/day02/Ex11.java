package day02;

import java.util.Scanner;
//While��
//while���� while(����) {}���� �̷������.
public class Ex11 {
	public static void main(String[] args) {
		int userNum = 10;
		while(userNum > 0) {
			System.out.println(userNum);
			userNum--;
		}
		//���ѷ����� © ������ �׻� Ż�⹮�� ������
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("���ѷ���");
			int num = scan.nextInt();
			if(num == -1) {
				break;
			}
		}
	}
}
