package day03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를  입력해주세요.");
		int lineN = scan.nextInt();
		for (int i = 0; i < lineN; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");

			}
			for (int j = lineN; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
