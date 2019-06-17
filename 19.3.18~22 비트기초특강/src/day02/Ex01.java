package day02;
import java.util.Scanner;
public class Ex01 {

	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요.");
		int age = scan.nextInt();
		
		//if문의 조건문은 결과가 True / False가 나와야 한다. 조건문은 논리연산자를 사용한다.
		
		if(age < 18) {
			System.out.println("미성년자입니다.");
		}
		else {
			System.out.println("성년입니다.");
		}
	}
}