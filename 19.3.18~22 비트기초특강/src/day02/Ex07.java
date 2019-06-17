package day02;
//성적을 받아서
//1. 수우미양가 형식으로 출력해보기
//2. A+,A0 ...... D-, F까지 출력해보기
//String + String = String
import java.util.Scanner;
public class Ex07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("성적을 입력해주세요.");
		int score = scan.nextInt();
		//1.수우미양가 출력해보기
		//case 100: case99: case98: -> 귀찮다
		switch (score / 10) {
		case 10:
			if(score % 10 == 0) {
				System.out.println("수");				
			}else {
				System.out.println("잘 못 입력하셨습니다.");
			}
			break;
		case 9:
			System.out.println("수");
			break;
		case 8 :
			System.out.println("우");
			break;
		case 7 :
			System.out.println("미");
			break;
		case 6 :
			System.out.println("양");
			break;
		case 5 : case 4 : case 3: case 2: case 1: case 0:
			System.out.println("가");
			break;
			default :
				System.out.println("잘 못 입력하셨습니다.");
				break;
	  }
	 }
	}
