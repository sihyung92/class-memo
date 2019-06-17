package day03;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("¼ýÀÚ");
		int nextN = scan.nextInt();
		for (int i = 0; i < nextN; i++) {			for (int j = 0; j < i ; j++) {
			System.out.print(" ");
		}
			for (int j = 2*nextN-1; j > 2*i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
