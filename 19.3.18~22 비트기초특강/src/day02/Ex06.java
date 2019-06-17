package day02;

//월을 입력받아 몇 일 까지 있는지 보여주는 프로그램
//Switch문을 사용한다.
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("월을 입력하세요");
		int month = scan.nextInt();
		switch (month) {
		// switch 문의 경우 변수가 만족하는 case 부터 break가 나오는 case까지 순차적으로 실행된다.
		case 1:		case 3:		case 5:		case 7:		case 8:		case 10:
		case 12:
			System.out.println("31일까지 있습니다.");
			break;
		case 4:		case 6:		case 9:		case 11:
			System.out.println("30일까지 있습니다.");
			break;
		case 2:
			System.out.println("연도를 입력해주세요. : ");
			int year = scan.nextInt();
			if (year % 4 == 0) {
				if (year % 100 == 0) {
					if (year % 400 == 0) {
						System.out.println("29일까지 있습니다.");
					} else {
						System.out.println("28일까지 있습니다.");
					}
				} else {
					System.out.println("29일까지 있습니다.");
				}
			} else {
				System.out.println("28일까지 있습니다.");
			}
			break;
		default:
			System.out.println("잘 못 입력하셨습니다.");
			break;
		}
	}
}
