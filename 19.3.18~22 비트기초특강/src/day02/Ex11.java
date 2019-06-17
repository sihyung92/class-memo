package day02;

import java.util.Scanner;
//While문
//while문은 while(조건) {}으로 이루어진다.
public class Ex11 {
	public static void main(String[] args) {
		int userNum = 10;
		while(userNum > 0) {
			System.out.println(userNum);
			userNum--;
		}
		//무한루프를 짤 때에는 항상 탈출문을 만들어라
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("무한루프");
			int num = scan.nextInt();
			if(num == -1) {
				break;
			}
		}
	}
}
