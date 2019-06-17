package day02;
import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 숫자를 입력받아 2의 배수인지 3의 배수인지 그 외의 경우인지 판단하는 프로그램

		System.out.println("숫자를 입력하시오");
		int input = scan.nextInt();
		//조건 만족하면 다음 조건은 보지도 않고 지나가기 때문에 6의 배수의 경우 2의 배수라고 출력된다.
		if (input %2==0) {
			System.out.println("2의 배수입니다.");
		}else if (input %3==0) {
			System.out.println("3의 배수입니다.");
		}else {System.out.println("그 외의 수입니다.");
		
		}
	}
}
