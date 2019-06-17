package day03;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("출력할 줄 수를 입력해주세요: ");
		int lineNum = scan.nextInt();
		// 1번 별 찍기
		// 1번 별은 직삼각형 모양
		//
		System.out.println("=====1번=====");
		for (int i = 1; i <= lineNum; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 2번 별 찍기
		// 2번 별은 역직삼각형 모양
		System.out.println("=====2번=====");
		for (int i = 1; i <= lineNum; i++) {
			for (int j = lineNum; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("=====3번=====");
		for (int i = 1; i <= lineNum; i++) {
			for (int j = lineNum - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=====4번=====");
		for (int i = 1; i <= lineNum; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = lineNum; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=====5번=====");
		for (int i = 1; i <= lineNum; i++) {
			for (int j = lineNum - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=====6번=====");
		for (int i = 1; i <= lineNum; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 2 * (lineNum - i) + 1; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=====7번 쉬운 버젼=====");
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
		System.out.println("=====7번 어려운 버젼=====");
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
		System.out.println("=====8번 쉬운버젼=====");
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
		System.out.println("=====9번=====");
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
		System.out.println("=====10번=====");
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
