package day03;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ���.");
		int lineNum = scan.nextInt();
		for (int i = 1; i <= lineNum; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}System.out.println();
		}		
	}
}
