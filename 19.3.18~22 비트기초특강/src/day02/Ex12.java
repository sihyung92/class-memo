package day02;
import java.util.Scanner;
public class Ex12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("0~100������ ���ڸ� �Է����ּ���.");
		int userNum = scan.nextInt();
		
		while(true) {
			if(userNum >= 0 && userNum <= 100) {
				break;
			}
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			System.out.print("�ٽ� �Է����ּ���: ");
			userNum = scan.nextInt();
		}
	}
}
