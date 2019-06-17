package day03;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("����� �� ���� �Է����ּ���: ");
		int lineNum = scan.nextInt();
		// 1�� �� ���
		// 1�� ���� ���ﰢ�� ���
		//
		System.out.println("=====1��=====");
		for (int i = 1; i <= lineNum; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 2�� �� ���
		// 2�� ���� �����ﰢ�� ���
		System.out.println("=====2��=====");
		for (int i = 1; i <= lineNum; i++) {
			for (int j = lineNum; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("=====3��=====");
		for (int i = 1; i <= lineNum; i++) {
			for (int j = lineNum - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=====4��=====");
		for (int i = 1; i <= lineNum; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = lineNum; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=====5��=====");
		for (int i = 1; i <= lineNum; i++) {
			for (int j = lineNum - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=====6��=====");
		for (int i = 1; i <= lineNum; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 2 * (lineNum - i) + 1; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=====7�� ���� ����=====");
		for (int i = 1; i <= lineNum; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= lineNum - 1; i++) {
			for (int j = lineNum - 1; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=====7�� ����� ����=====");
		for (int i = 1; i <= 2 * lineNum - 1; i++) {
			if (i <= lineNum) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
			} else {
				int k = i - lineNum;
				for (int j = lineNum - k; j >= 1; j--) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println("=====8�� �������=====");
		for (int i = 1; i <= lineNum; i++) {
			for (int j = lineNum - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= lineNum - 1; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = lineNum - 1; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=====9��=====");
		for (int i = 1; i <= 2 * lineNum - 1; i++) {
			if (i <= lineNum) {
				for (int j = lineNum - 1; j >= i; j--) {
					System.out.print(" ");
				}
				for (int j = 1; j <= 2 * i - 1; j++) {
					System.out.print("*");
				}
			} else {
				int k = i - lineNum;
				for (int j = 1; j <= k; j++) {
					System.out.print(" ");
				}
				for (int j = 2 * (lineNum - k) - 1; j >= 1; j--) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println("=====10��=====");
		for (int i = 1; i <= 2 * lineNum - 1; i++) {
			if (i == 1 || i == 2 * lineNum - 1) {
				for (int j = 1; j <= 2 * lineNum - 1; j++) {
					System.out.print("*");
				}
			}else {
				if( i <= lineNum) {
					for(int j = lineNum; j >= i;j--) {
						System.out.print("*");
					}
					for(int j = 1; j <= 2 * i - 3; j++) {
						System.out.print(" ");
					}
					for(int j = lineNum; j >= i;j--) {
						System.out.print("*");
					}
				}else {
					int k = i - lineNum;
					for(int j = 1; j <= k + 1; j++) {
						System.out.print("*");
					}
					for(int j = 2*lineNum - 5; j > 2*(k-1); j--) {
						System.out.print(" ");
					}
					for(int j = 1; j <= k + 1; j++) {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
	}
}
