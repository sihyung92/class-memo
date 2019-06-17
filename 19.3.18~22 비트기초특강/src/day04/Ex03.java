package day04;

import java.util.Random;
import java.util.Scanner;

//가변형 배열을 만들어서
//숫자 정렬하기 (작은 순 -> 큰 순)
public class Ex03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("크기를 정해주세요. : ");
		int size = scan.nextInt();
		int[] arr = new int[size];
		Random rand = new Random();
		for (int i = 0; i < size; i++) {
			// 난수를 발생시키는 클래스
			arr[i] = rand.nextInt(size);
		}
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if(i != j && arr[i] == arr[j]) {
					arr[j] = rand.nextInt(size);
					i=0;
				}
			}
		}
		for (int i = 0 ; i < size - 1 ; i ++) {
			if(arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				i=-1;
			}
		}
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
	}
}