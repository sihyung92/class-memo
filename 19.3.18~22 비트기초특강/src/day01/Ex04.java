package day01;
import java.util.Scanner;
public class Ex04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String myString = scan.nextLine();
		
		System.out.println(myString);
		
		int myNum = scan.nextInt();
		System.out.println(myNum);
		//nextint�� �� �� �ٷ� nextLine�� �� ��� �Է��� �ȵǴ� ���װ� ����. �����ϱ� ���Ͽ�
		//scan.nextLine()�� �ѹ� �Է�����
		scan.nextLine();
		myString = scan.nextLine();
		System.out.println(myString);
	}
}
