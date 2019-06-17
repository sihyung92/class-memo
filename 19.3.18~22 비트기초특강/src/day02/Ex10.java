package day02;

//숫자를 입력받아서 0~숫자까지 출력하는 프로그램
import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int num = scan.nextInt();
		for (int i = 0; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.println(i + "은(는) 짝수입니다.");
			} else {
				System.out.println(i + " 홀수입니다.");
			}
		}
	}
}