package day02;
import java.util.Scanner;
public class Ex08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력해 주세요.");
		int score = scan.nextInt();
		// 100점보다 크거나 0점보다 작은 경우
		// 성적을 보여줄 String 변수를 선언한다.
		String letterGrade = new String();
		if (score > 100 || score < 0) {
			letterGrade = "Wrong";
			letterGrade = new String("Wrong");
			// String100 비교는 .equals() 라는 메소드로 비교한다
			System.out.println("잘 못 입력하셨습니다.");
		} else if (score >= 90) {
			letterGrade = "A";
		} else if (score >= 80) {
			letterGrade = "B";
		} else if (score >= 70) {
			letterGrade = "C";
		} else if (score >= 60) {
			letterGrade = "D";
		} else {
			letterGrade = "F";
		}
		if (!letterGrade.equals("Wrong")) {
			if (score % 10 >= 7) {
				letterGrade = letterGrade + "+";
			} else if (score % 10 >= 4) {
				letterGrade += "0";
				// a += 1 > 기존의 값 a = a+1
			} else {
				letterGrade += "-";
			}
			if (score == 100) {
				letterGrade = "A+";
			}
			System.out.println(letterGrade);
		}
	}
}
