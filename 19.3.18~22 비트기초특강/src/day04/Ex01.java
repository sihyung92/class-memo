package day04;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// 배열 선언하기
		int[] arr = new int[5];
		// 배열에 값 넣기
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		// 배열의 값 출력하기
		System.out.println(arr[3]);

		String[] arr2 = new String[5];

		arr2[0] = "a";
		arr2[1] = "b";
		arr2[2] = "c";
		arr2[3] = "d";
		arr2[4] = "e";

		System.out.println(arr2[3]);

		Scanner[] scan = new Scanner[5];
		for (int i = 0; i < scan.length; i++) {
			scan[i] = new Scanner(System.in);
		}
		arr2[0] = scan[0].nextLine();
		System.out.println(arr2[0]);
	}
}
