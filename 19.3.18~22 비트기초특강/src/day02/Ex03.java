package day02;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("성적을 입력하시오.");
		int score = scan.nextInt();
		scan.close();
		if (score > 100) {
			System.out.println("잘 못 입력하셨습니다.");
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