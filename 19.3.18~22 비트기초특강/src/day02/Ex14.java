package day02;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ���.");
		int num = scan.nextInt();
		for (int i = 0; i <= num; i++) {
			for (int j = 0 ; j <= 5 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
