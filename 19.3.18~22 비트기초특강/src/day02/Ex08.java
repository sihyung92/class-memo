package day02;
import java.util.Scanner;
public class Ex08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է��� �ּ���.");
		int score = scan.nextInt();
		// 100������ ũ�ų� 0������ ���� ���
		// ������ ������ String ������ �����Ѵ�.
		String letterGrade = new String();
		if (score > 100 || score < 0) {
			letterGrade = "Wrong";
			letterGrade = new String("Wrong");
			// String100 �񱳴� .equals() ��� �޼ҵ�� ���Ѵ�
			System.out.println("�� �� �Է��ϼ̽��ϴ�.");
		} else if (score >= 90) {
			letterGrade = "A";
		} else if (score >= 80) {
			letterGrade = "B";
		} else if (score >= 70) {
			letterGrade = "C";
		} else if (score >= 60) {
			letterGrade = "D";
		} else {
			letterGrade = "F";
		}
		if (!letterGrade.equals("Wrong")) {
			if (score % 10 >= 7) {
				letterGrade = letterGrade + "+";
			} else if (score % 10 >= 4) {
				letterGrade += "0";
				// a += 1 > ������ �� a = a+1
			} else {
				letterGrade += "-";
			}
			if (score == 100) {
				letterGrade = "A+";
			}
			System.out.println(letterGrade);
		}
	}
}
