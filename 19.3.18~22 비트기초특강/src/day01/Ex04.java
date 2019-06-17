package day01;
import java.util.Scanner;
public class Ex04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String myString = scan.nextLine();
		
		System.out.println(myString);
		
		int myNum = scan.nextInt();
		System.out.println(myNum);
		//nextint를 한 후 바로 nextLine을 할 경우 입력이 안되는 버그가 생김. 방지하기 위하여
		//scan.nextLine()을 한번 입력해줌
		scan.nextLine();
		myString = scan.nextLine();
		System.out.println(myString);
	}
}
