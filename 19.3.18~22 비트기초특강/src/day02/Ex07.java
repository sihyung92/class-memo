package day02;
//������ �޾Ƽ�
//1. ����̾簡 �������� ����غ���
//2. A+,A0 ...... D-, F���� ����غ���
//String + String = String
import java.util.Scanner;
public class Ex07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է����ּ���.");
		int score = scan.nextInt();
		//1.����̾簡 ����غ���
		//case 100: case99: case98: -> ������
		switch (score / 10) {
		case 10:
			if(score % 10 == 0) {
				System.out.println("��");				
			}else {
				System.out.println("�� �� �Է��ϼ̽��ϴ�.");
			}
			break;
		case 9:
			System.out.println("��");
			break;
		case 8 :
			System.out.println("��");
			break;
		case 7 :
			System.out.println("��");
			break;
		case 6 :
			System.out.println("��");
			break;
		case 5 : case 4 : case 3: case 2: case 1: case 0:
			System.out.println("��");
			break;
			default :
				System.out.println("�� �� �Է��ϼ̽��ϴ�.");
				break;
	  }
	 }
	}
