package day02;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ�.");
		int score = scan.nextInt();
		scan.close();
		if (score > 100) {
			System.out.println("�� �� �Է��ϼ̽��ϴ�.");
		} else if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
}