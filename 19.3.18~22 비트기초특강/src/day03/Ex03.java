package day03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է�����");
		int lineNum = scan.nextInt();
		for (int i = 1; i <= lineNum; i++) {
			for (int j = lineNum; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();}
	}
}
