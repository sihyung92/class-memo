package day02;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = new String();
		int kor = 0;
		int eng = 0;
		int math = 0;
		while (true) {
			System.out.print("1. 새로 입력 2. 마지막 점수 출력 3. 종료");
			int userChoice = scan.nextInt();
			if (userChoice == 3) {
				System.out.println("사용해주셔서 감사합니다.");
				break;
			} else if (userChoice == 1) {
				scan.nextLine();
				System.out.print("이름을 입력해주세요: ");
				name = scan.nextLine();

				System.out.print("국어점수를 입력해주세요: ");
				kor = scan.nextInt();
				while (true) {
					if (kor >= 0 && kor <= 100) {
						break;
					}
					System.out.print("다시 입력해주세요 : ");
					kor = scan.nextInt();
				}
				System.out.print("영어 점수를 입력해주세요: ");
				eng = scan.nextInt();
				while (true) {
					if (eng >= 0 && eng <= 100) {
						break;
					}
					System.out.print("다시 입력해주세요 : ");
					eng = scan.nextInt();
				}
				System.out.print("수학 점수를 입력해주세요: ");
				math = scan.nextInt();
				while (true) {
					if (math >= 0 && math <= 100) {
						break;
					}
					System.out.print("다시 입력해주세요 : ");
					math = scan.nextInt();
				}
			} else if (userChoice == 2) {
				if (name.equals("")) {
					System.out.println("입력된 값이 없습니다.");
				} else {
					System.out.println("이름은 " + name + "이고 국어점수는 " + kor + " 영어점수는 " + eng + " 수학점수는 " + math + "입니다.");
					int sum = kor + eng + math;
					System.out.println("총 점수는 "+sum+"입니다.");
					System.out.println("평균 점수는 " +sum / 3.0f+"입니다.");
				}
			}
		}
	}
}
