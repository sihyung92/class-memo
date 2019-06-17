package day03;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("출력한 줄 수를 입력해주세요.");
		int lineNum = scan.nextInt();
		// 1번 별 찍기
		// 1번 별은 직각삼각형 모양
		//
		System.out.println("====1번====");
		for (int i = 1; i <= lineNum; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 2번별찍기
		// 2번별은 역직삼각형 모양
		System.out.println("====2번====");
		for (int i = 1; i <= lineNum; i++) {
			for (int j = lineNum; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("====3번====");
		for (int i = 1; i <= lineNum; i++) {
			for (int j = lineNum - 1; j >= i; j--) {
				System.out.print(" ");
				// for (int j = lineNum-i; j >= 1 ; j--) 도 가능
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("====4번====");
		for (int i = 1; i <= lineNum; i++) {
			for (int j = 2; j <= i; j++) {
				System.out.print(" ");
				// for (int j=1; j<=i-1; j++)
			}
			for (int k = lineNum; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("====5번====");
		for (int i = 1; i <= lineNum; i++) {
			for (int j = lineNum - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("====6번====");
		for (int i = 1; i <= lineNum; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 2 * lineNum - 1; j >= 2 * i - 1; j--)
			// for (int j = 2*(lineNum-i+1)-1; j>=1; j--)
			{
				System.out.print("*");
			}

			System.out.println("");
		}
		System.out.println("====7번====");
		for (int i = 1; i <= 2 * lineNum - 1; i++) {
			if (i <= lineNum) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
			} else {
				// int k = i-lineNum;
				// for(int j = lineNum-k; j>=1; j--)
				for (int j = 2 * lineNum - 1; j >= i; j--) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println("====8번====");
		for (int i = 1; i <= 2 * lineNum - 1; i++) {
			if (i <= lineNum) {
				for (int j = lineNum - 1; j >= i; j--) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
			} else {
				int k = i - lineNum;
				for (int j = 1; j <= k; j++) {
					System.out.print(" ");
				}
				for (int j = 2 * lineNum - 1; j >= i; j--) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println("====9번====");
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
				for (int j = 4 * lineNum - 3; j >= 2 * i - 1; j--) {
					System.out.print("*");
					// for (int j = 2*lineNum-1-2*k; j>=1; j--)
				}
			}
			System.out.println();
		}
		System.out.println("====10번====");
		for (int i = 1; i <= 2 * lineNum - 1; i++) {
			if (i == 1 || i == 2 * lineNum - 1) {
				for (int j = 1; j <= 2 * lineNum - 1; j++) {
					System.out.print("*");
				}
			} else {
				if (i <= lineNum) {
					for (int j = lineNum; j >= i; j--) {
						System.out.print("*");
					}
					for (int j = 1; j <= 2 * i - 3; j++) {
						System.out.print(" ");
					}
					for (int j = lineNum; j >= i; j--) {
						System.out.print("*");
					}
				} else {
					int k = i - lineNum;
					for (int j = 1; j <= k + 1; j++) {
						System.out.print("*");
					}
					for (int j = 2 * (lineNum - k) - 3; j >= 1; j--) {
						System.out.print(" ");
						//for (int j = 2*lineNum-5; j>=2*(k-1); j--)
					}
					for (int j = 1; j <= k + 1; j++) {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
	}
}