package day01;
//학생의 이름, 국어점수, 영어점수, 수학점수를 입력받아서 출력하는 프로그램
import java.util.Scanner;
public class Ex05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력해주세요: ");
		String name = scan.nextLine();
		System.out.print("국어점수를 입력해주세요: ");
		int kor = scan.nextInt();
		System.out.print("영어점수를 입력해주세요: ");
		int eng = scan.nextInt();
		System.out.print("수학점수를 입력해주세요: ");
		int math = scan.nextInt();
		System.out.println(name+"학생의 국어점수는 "+kor+"점이고 영어점수는 "+eng+"점이고 수학점수는 "+math+"점입니다.");
	}
}
