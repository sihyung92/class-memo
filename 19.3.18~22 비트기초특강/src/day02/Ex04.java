package day02;
import java.util.Scanner;
public class Ex04 {
	//윤년 계산하는 법
	//연수가 4로 나누어 떨어지는 해
	//그 중에서 100으로 나누어 떨어지는 해는 평년 
	//그 중에서 400으로 나누어 떨어지는 해는 다시 윤년으로 정하였다
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("연도를 입력하세요.");
		int year = scan.nextInt();
		if(year % 4 == 0) {
			//윤년일 가능성이 생긴다
			//연도 / 100 이 0이면 평년
			if(year % 100 == 0) {
				//연도 /400이 0이면 윤년
				if(year % 400 == 0) {
					System.out.println("윤년입니다.");
				}else {
						System.out.println("평년입니다.");
				}
			}else {
				System.out.println("윤년입니다.");
			}
	}else {
			System.out.println("평년입니다.");
		}
	}
}