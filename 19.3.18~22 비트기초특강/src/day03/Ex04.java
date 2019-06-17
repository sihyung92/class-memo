package day03;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("¼ıÀÚ");
		int lineN = scan.nextInt();
		for (int i = 0; i <= lineN; i++) {
			for (int j = lineN-1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
