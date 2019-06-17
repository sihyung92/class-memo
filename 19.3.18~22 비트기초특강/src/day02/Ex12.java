package day02;
import java.util.Scanner;
public class Ex12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("0~100사이의 숫자를 입력해주세요.");
		int userNum = scan.nextInt();
		
		while(true) {
			if(userNum >= 0 && userNum <= 100) {
				break;
			}
			System.out.println("잘못 입력하셨습니다.");
			System.out.print("다시 입력해주세요: ");
			userNum = scan.nextInt();
		}
	}
}
