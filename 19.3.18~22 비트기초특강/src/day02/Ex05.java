package day02;
import java.util.Scanner;
public class Ex05 {
	public static void main(String[] args) {
		int num = 5;
		switch(num) {
		//break절을 넣지 않으면 break가 나올 때 혹은 끝날 때 까지 실행함.
		case 5:
			System.out.println("5입니다.");
			break;
		case 4:
			System.out.println("4입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;
		default:
			System.out.println("그 외의 숫자입니다.");
			break;
		}
	}
}
